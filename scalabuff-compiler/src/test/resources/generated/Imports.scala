// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: imports.proto

package resources.generated

//import "simple.proto"

final case class UsesImport (
	`simpleTest`: SimpleTest = SimpleTest.defaultInstance
) extends com.google.protobuf2.GeneratedMessageLite
	with com.google.protobuf2.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[UsesImport]
	with net.sandrogrzicic.scalabuff.Parser[UsesImport] {

	

def escape(raw: Any): String = {
  import scala.reflect.runtime.universe._
  Literal(Constant(raw)).toString
}

          

	def writeTo(output: com.google.protobuf2.CodedOutputStream) {
		output.writeMessage(1, `simpleTest`)
	}

	def getSerializedSize = {
		import com.google.protobuf2.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `simpleTest`)

		__size
	}

	def mergeFrom(in: com.google.protobuf2.CodedInputStream, extensionRegistry: com.google.protobuf2.ExtensionRegistryLite): UsesImport = {
		import com.google.protobuf2.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __simpleTest: SimpleTest = SimpleTest.defaultInstance

		def __newMerged = UsesImport(
			__simpleTest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __simpleTest = readMessage[SimpleTest](in, __simpleTest, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: UsesImport) = {
		UsesImport(
			m.`simpleTest`
		)
	}

	def getDefaultInstanceForType = UsesImport.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf2.CodedInputStream, er: com.google.protobuf2.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"simpleTest\": ").append(`simpleTest`.toJson(indent + 1)).append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object UsesImport {
	@scala.beans.BeanProperty val defaultInstance = new UsesImport()

	def parseFrom(data: Array[Byte]): UsesImport = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): UsesImport = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf2.ByteString): UsesImport = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): UsesImport = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[UsesImport] = defaultInstance.mergeDelimitedFromStream(stream)

	val SIMPLE_TEST_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: UsesImport) = defaultInstance.mergeFrom(prototype)

}

object Imports {
	def registerAllExtensions(registry: com.google.protobuf2.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf2.GeneratedMessageLite](
		 "UsesImport" -> (bytes ⇒ UsesImport.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf2.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
