package tests

import org.scalatest.{FunSuite, Matchers}
import net.sandrogrzicic.scalabuff.compiler._
import java.io.{FileFilter, PrintStream, ByteArrayOutputStream, File}
import File.{separator => /}

/**
 * ScalaBuff performance test.
 * @author Sandro Gržičić
 */

class PerformanceTest extends FunSuite with Matchers {

  val WARMUP_COUNT = 20
  val REPEAT_COUNT = 20

  val protoDir = "scalabuff-compiler" + / + "src" + / + "test" + / + "scala" + / + "resources" + / + "proto" + /
  val protoDirFile = new File(protoDir)

  val protoFileFilter = new FileFilter {
    def accept(filtered: File) = filtered.getName.endsWith(".proto")
  }

  val outputStream = new ByteArrayOutputStream()
  val printStream = new PrintStream(outputStream)

  test("performance test") {

    val inputFiles = protoDirFile.listFiles(protoFileFilter).map(_.getName)
    val scalaBuffArguments = Array("--stdout", "--verbose", "--proto_path=" + protoDir) ++ inputFiles

    def doRun() {
      outputStream.reset()
      Console.withOut(printStream) {
        ScalaBuff.run(scalaBuffArguments)
      }
    }

    // JVM warmup
    var warmupRun: Int = 0
    while (warmupRun < WARMUP_COUNT) {
      doRun()
      warmupRun += 1
    }

    System.gc()
    val start = System.currentTimeMillis()
    var run = 0
    while (run < REPEAT_COUNT) {
      doRun()
      run += 1
    }
    val time = (System.currentTimeMillis() - start) / REPEAT_COUNT.toDouble

    info("Time per run: " + time + " ms")
  }
}

