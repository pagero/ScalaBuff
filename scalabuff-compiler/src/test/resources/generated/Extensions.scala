// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: extensions.proto

package resources.generated

final case class ExtensionsTest (
	`foo`: Int = 0
) extends com.google.protobuf2.GeneratedMessageLite.ExtendableMessage[ExtensionsTest]
	with net.sandrogrzicic.scalabuff.ExtendableMessage[ExtensionsTest]
	with net.sandrogrzicic.scalabuff.Parser[ExtensionsTest] {

	

def escape(raw: Any): String = {
  import scala.reflect.runtime.universe._
  Literal(Constant(raw)).toString
}

          

	def writeTo(output: com.google.protobuf2.CodedOutputStream) {
		output.writeInt32(1, `foo`)
	}

	def getSerializedSize = {
		import com.google.protobuf2.CodedOutputStream._
		var __size = 0
		__size += computeInt32Size(1, `foo`)

		__size
	}

	def mergeFrom(in: com.google.protobuf2.CodedInputStream, extensionRegistry: com.google.protobuf2.ExtensionRegistryLite): ExtensionsTest = {
		import com.google.protobuf2.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __foo: Int = 0

		def __newMerged = ExtensionsTest(
			__foo
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __foo = in.readInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: ExtensionsTest) = {
		ExtensionsTest(
			m.`foo`
		)
	}

	def getDefaultInstanceForType = ExtensionsTest.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf2.CodedInputStream, er: com.google.protobuf2.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = throw new RuntimeException("Method not available.")
	def toBuilder = throw new RuntimeException("Method not available.")
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"foo\": ").append("\"").append(`foo`).append("\"").append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object ExtensionsTest {
	@scala.beans.BeanProperty val defaultInstance = new ExtensionsTest()

	def parseFrom(data: Array[Byte]): ExtensionsTest = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): ExtensionsTest = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf2.ByteString): ExtensionsTest = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): ExtensionsTest = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[ExtensionsTest] = defaultInstance.mergeDelimitedFromStream(stream)

	val FOO_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: ExtensionsTest) = defaultInstance.mergeFrom(prototype)

}

object Extensions {
	def registerAllExtensions(registry: com.google.protobuf2.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf2.GeneratedMessageLite](
		 "ExtensionsTest" -> (bytes ⇒ ExtensionsTest.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf2.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
