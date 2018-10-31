val scalaVersionStr = "2.11.12"

val scalaCrossVersions = Seq("2.11.12", "2.12.6")

val projectVersion = ThisBuild / version

name := "ScalaBuff"

lazy val defaultSettings = Seq(
  organization := "com.pagero",
  version := projectVersion.value,
  logLevel := Level.Info,
  libraryDependencies ++= Seq(
    "com.google.protobuf2" % "protobuf-java" % "2.5.0-pb2",
    "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.7",
    "org.scala-lang" % "scala-reflect" % scalaVersion.value
  ),
  scalaVersion := scalaVersionStr,
  crossScalaVersions ++= scalaCrossVersions,
  scalacOptions ++= Seq("-encoding", "utf8", "-unchecked", "-deprecation", "-Xlint", "-feature", "-Xlog-reflective-calls"),
  javacOptions ++= Seq("-encoding", "utf8", "-Xlint:unchecked", "-Xlint:deprecation"),
  parallelExecution in GlobalScope := true,
  compileOrder := CompileOrder.Mixed
)

lazy val compilerProject = (project in file("scalabuff-compiler"))
  .dependsOn(runtimeProject % "test->compile")
  .settings(
    defaultSettings,
    name := "scalabuff-compiler",
    mainClass in(Compile, run) := Some("net.sandrogrzicic.scalabuff.compiler.ScalaBuff"),
    mainClass in(Compile, packageBin) := Some("net.sandrogrzicic.scalabuff.compiler.ScalaBuff"),
    fullRunTask(TaskKey[Unit]("update-test-resources"), Compile, "net.sandrogrzicic.scalabuff.test.UpdateTestResources")
  )

lazy val runtimeProject = (project in file("scalabuff-runtime"))
  .settings(
    defaultSettings,
    name := "scalabuff-runtime",
  )

val root = project.in(file("."))
  .aggregate(compilerProject, runtimeProject)


/**
  * ScalaBuff SBT build file.
  *
  * Useful SBT commands:
  *
  * run (arguments)             Runs ScalaBuff inside SBT with the specified arguments.
  * test                        Runs the tests.
  * package                     Generates the main ScalaBuff compiler .JAR.
  * update-test-resources       Regenerates the test resources using ScalaBuff.
  *
  * project scalabuff-compiler  Switches to the compiler project (default).
  * project scalabuff-runtime   Switches to the runtime project.
  *
  */
