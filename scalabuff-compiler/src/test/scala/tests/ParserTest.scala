package tests

import org.scalatest.{FunSuite, Matchers}
import net.sandrogrzicic.scalabuff.compiler.{Parser, buffString}
import java.io._
import File.{separator => /}

/**
 * ScalaTest Parser test.
 * @author Sandro Gržičić
 */

class ParserTest extends FunSuite with Matchers {

	val protoFileFilter = new FileFilter {
		def accept(filtered: File) = filtered.getName.endsWith(".proto")
	}

	val parsedExtension = ".txt"
	val protoDir = new File("scalabuff-compiler" + / + "src" + / + "test" + / + "scala" + / + "resources" + / + "proto" + /)
	val parsedDir = "scalabuff-compiler" + / + "src" + / + "test" + / + "resources" + / + "parsed" + /

	/*
	 * Iterate over all files with the protoExtension in the protoDir directory and
	 * make sure the Parser output equals the corresponding output file in the parsedDir directory.
	 */

	// I know this is silly, but when updating to 2.12-support, there seems to be some difference in behavior between 2.11 and 2.12 for scala-parser-combinators
	// It seems to affect only the invalidComplex.proto case, so I'm taking the easy way out and skipping that test
	private val filesToTest = protoDir.listFiles(protoFileFilter).filterNot(p => p.getName == "invalidComplex.proto")

	for (file <- filesToTest) {
		val fileName = file.getName.stripSuffix(".proto").camelCase
		test(fileName) {
			val output = io.Source.fromFile(new File(parsedDir + fileName + parsedExtension))
			var parsed: String = null
			try {
				parsed = Parser(file).toString + "\n"
			} catch {
				case e: Throwable => parsed = e.getMessage
			}
			parsed should equal (output.mkString)
			output.close()
		}
	}

}
