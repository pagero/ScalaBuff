// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: packed.proto

package resources.generated

final case class PackedTest (
	`requiredField`: Int = 0,
	`optionalField`: Option[Float] = None,
	`repeatedPackedField`: scala.collection.immutable.Seq[Int] = Vector.empty[Int]
) extends com.google.protobuf2.GeneratedMessageLite
	with com.google.protobuf2.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[PackedTest]
	with net.sandrogrzicic.scalabuff.Parser[PackedTest] {

	

def escape(raw: Any): String = {
  import scala.reflect.runtime.universe._
  Literal(Constant(raw)).toString
}

          	def setOptionalField(_f: Float) = copy(`optionalField` = Some(_f))
	def setRepeatedPackedField(_i: Int, _v: Int) = copy(`repeatedPackedField` = `repeatedPackedField`.updated(_i, _v))
	def addRepeatedPackedField(_f: Int) = copy(`repeatedPackedField` = `repeatedPackedField` :+ _f)
	def addAllRepeatedPackedField(_f: Int*) = copy(`repeatedPackedField` = `repeatedPackedField` ++ _f)
	def addAllRepeatedPackedField(_f: TraversableOnce[Int]) = copy(`repeatedPackedField` = `repeatedPackedField` ++ _f)

	def clearOptionalField = copy(`optionalField` = None)
	def clearRepeatedPackedField = copy(`repeatedPackedField` = Vector.empty[Int])

	def writeTo(output: com.google.protobuf2.CodedOutputStream) {
		output.writeInt32(1, `requiredField`)
		if (`optionalField`.isDefined) output.writeFloat(2, `optionalField`.get)
		// write field repeated_packed_field packed 
		if (!`repeatedPackedField`.isEmpty) {
			import com.google.protobuf2.CodedOutputStream._
			val dataSize = `repeatedPackedField`.map(computeInt32SizeNoTag(_)).sum 
			output.writeRawVarint32(26)
			output.writeRawVarint32(dataSize)
			for (_v <- `repeatedPackedField`) output.writeInt32NoTag(_v)
		}
	}

	def getSerializedSize = {
		import com.google.protobuf2.CodedOutputStream._
		var __size = 0
		__size += computeInt32Size(1, `requiredField`)
		if (`optionalField`.isDefined) __size += computeFloatSize(2, `optionalField`.get)
		if (!`repeatedPackedField`.isEmpty) {
			val dataSize = `repeatedPackedField`.map(computeInt32SizeNoTag(_)).sum 
			__size += 1 + computeInt32SizeNoTag(dataSize) + dataSize
		}

		__size
	}

	def mergeFrom(in: com.google.protobuf2.CodedInputStream, extensionRegistry: com.google.protobuf2.ExtensionRegistryLite): PackedTest = {
		import com.google.protobuf2.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __requiredField: Int = 0
		var __optionalField: Option[Float] = `optionalField`
		val __repeatedPackedField: scala.collection.mutable.Buffer[Int] = `repeatedPackedField`.toBuffer

		def __newMerged = PackedTest(
			__requiredField,
			__optionalField,
			Vector(__repeatedPackedField: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __requiredField = in.readInt32()
			case 21 => __optionalField = Some(in.readFloat())
			case 24 => __repeatedPackedField += in.readInt32()
			case 26 => 
				val length = in.readRawVarint32()
				val limit = in.pushLimit(length)
				while (in.getBytesUntilLimit() > 0) {
					__repeatedPackedField += in.readInt32()
				}
				in.popLimit(limit)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: PackedTest) = {
		PackedTest(
			m.`requiredField`,
			m.`optionalField`.orElse(`optionalField`),
			`repeatedPackedField` ++ m.`repeatedPackedField`
		)
	}

	def getDefaultInstanceForType = PackedTest.defaultInstance
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
			sb.append(indent1).append("\"requiredField\": ").append("\"").append(`requiredField`).append("\"").append(',')
			if (`optionalField`.isDefined) { sb.append(indent1).append("\"optionalField\": ").append("\"").append(`optionalField`.get).append("\"").append(',') }
			sb.append(indent1).append("\"repeatedPackedField\": [").append(indent2).append(`repeatedPackedField`.map("\"" + _ + "\"").mkString(", " + indent2)).append(indent1).append(']').append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object PackedTest {
	@scala.beans.BeanProperty val defaultInstance = new PackedTest()

	def parseFrom(data: Array[Byte]): PackedTest = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): PackedTest = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf2.ByteString): PackedTest = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): PackedTest = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[PackedTest] = defaultInstance.mergeDelimitedFromStream(stream)

	val REQUIRED_FIELD_FIELD_NUMBER = 1
	val OPTIONAL_FIELD_FIELD_NUMBER = 2
	val REPEATED_PACKED_FIELD_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: PackedTest) = defaultInstance.mergeFrom(prototype)

}

object Packed {
	def registerAllExtensions(registry: com.google.protobuf2.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf2.GeneratedMessageLite](
		 "PackedTest" -> (bytes ⇒ PackedTest.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf2.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
