import sbt.Keys._
import sbt.{Def, _}

/**
 * ScalaBuff SBT build file.
 *
 * Useful SBT commands:
 *
 *   run (arguments)             Runs ScalaBuff inside SBT with the specified arguments.
 *   test                        Runs the tests.
 *   package                     Generates the main ScalaBuff compiler .JAR.
 *   update-test-resources       Regenerates the test resources using ScalaBuff.
 *
 *   project scalabuff-compiler  Switches to the compiler project (default).
 *   project scalabuff-runtime   Switches to the runtime project.
 *
 */
object ScalaBuffBuild extends Build {

  private val scalaCrossVersions = Seq("2.11.12", "2.12.6")

  lazy val buildSettings = Seq(
		name := "ScalaBuff",
		organization := "net.sandrogrzicic",
		version := "1.4.0-4pb2-SNAPSHOT",
		//scalaVersion := "2.11.12",
    crossScalaVersions := scalaCrossVersions,
		logLevel := Level.Info
	)

	override lazy val settings: Seq[Def.Setting[_]] = super.settings ++ buildSettings

	lazy val defaultSettings: Seq[Def.Setting[_]] = Defaults.coreDefaultSettings ++ Seq(

		libraryDependencies ++= Seq(
			"com.google.protobuf2" % "protobuf-java" % "2.5.0-pb2",
      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
		) ++
      (CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) if scalaMajor >= 11 =>
          Seq("org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.7")
        case _ =>
          Seq()
      }),

		crossScalaVersions ++= scalaCrossVersions,

		scalacOptions ++= Seq("-encoding", "utf8", "-unchecked", "-deprecation", "-Xlint", "-feature", "-Xlog-reflective-calls"),

		javacOptions ++= Seq("-encoding", "utf8", "-Xlint:unchecked", "-Xlint:deprecation"),

		parallelExecution in GlobalScope := true,

		scalaSource in Compile <<= baseDirectory(_ / "src/main"),
		scalaSource in Test <<= baseDirectory(_ / "src/test"),

		javaSource in Compile <<= baseDirectory(_ / "src/main"),
		javaSource in Test <<= baseDirectory(_ / "src/test"),

		compileOrder := CompileOrder.Mixed,
		
		credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
	)

	lazy val compilerProject = Project(
		id = "scalabuff-compiler",
		base = file("scalabuff-compiler"),
		dependencies = Seq(runtimeProject % "test->compile"),
		settings = defaultSettings ++ Seq(
			mainClass in (Compile, run) := Some("net.sandrogrzicic.scalabuff.compiler.ScalaBuff"),
			mainClass in (Compile, packageBin) := Some("net.sandrogrzicic.scalabuff.compiler.ScalaBuff"),
			fullRunTask(TaskKey[Unit]("update-test-resources"), Compile, "net.sandrogrzicic.scalabuff.test.UpdateTestResources")
		)
	)

	lazy val runtimeProject = Project(
		id = "scalabuff-runtime",
		base = file("scalabuff-runtime"),
		settings = defaultSettings
	)

  val root = project.in(file(".")) settings (publish := {}) aggregate(compilerProject, runtimeProject)

}
