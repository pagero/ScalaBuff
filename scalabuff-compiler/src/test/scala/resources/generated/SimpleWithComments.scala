// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: simpleWithComments.proto

package resources.generated

final case class SimpleRequest (
	`query`: String = "",
	`pageNumber`: Option[Int] = None,
	`resultsPerPage`: Option[Int] = None
) extends com.google.protobuf2.GeneratedMessageLite
	with com.google.protobuf2.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[SimpleRequest]
	with net.sandrogrzicic.scalabuff.Parser[SimpleRequest] {

	

def escape(raw: Any): String = {
  import scala.reflect.runtime.universe._
  Literal(Constant(raw)).toString
}

          	def setPageNumber(_f: Int) = copy(`pageNumber` = Some(_f))
	def setResultsPerPage(_f: Int) = copy(`resultsPerPage` = Some(_f))

	def clearPageNumber = copy(`pageNumber` = None)
	def clearResultsPerPage = copy(`resultsPerPage` = None)

	def writeTo(output: com.google.protobuf2.CodedOutputStream) {
		output.writeString(1, `query`)
		if (`pageNumber`.isDefined) output.writeInt32(2, `pageNumber`.get)
		if (`resultsPerPage`.isDefined) output.writeInt32(3, `resultsPerPage`.get)
	}

	def getSerializedSize = {
		import com.google.protobuf2.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `query`)
		if (`pageNumber`.isDefined) __size += computeInt32Size(2, `pageNumber`.get)
		if (`resultsPerPage`.isDefined) __size += computeInt32Size(3, `resultsPerPage`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf2.CodedInputStream, extensionRegistry: com.google.protobuf2.ExtensionRegistryLite): SimpleRequest = {
		import com.google.protobuf2.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __query: String = ""
		var __pageNumber: Option[Int] = `pageNumber`
		var __resultsPerPage: Option[Int] = `resultsPerPage`

		def __newMerged = SimpleRequest(
			__query,
			__pageNumber,
			__resultsPerPage
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __query = in.readString()
			case 16 => __pageNumber = Some(in.readInt32())
			case 24 => __resultsPerPage = Some(in.readInt32())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: SimpleRequest) = {
		SimpleRequest(
			m.`query`,
			m.`pageNumber`.orElse(`pageNumber`),
			m.`resultsPerPage`.orElse(`resultsPerPage`)
		)
	}

	def getDefaultInstanceForType = SimpleRequest.defaultInstance
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
			sb.append(indent1).append("\"query\": ").append("\"").append(`query`).append("\"").append(',')
			if (`pageNumber`.isDefined) { sb.append(indent1).append("\"pageNumber\": ").append("\"").append(`pageNumber`.get).append("\"").append(',') }
			if (`resultsPerPage`.isDefined) { sb.append(indent1).append("\"resultsPerPage\": ").append("\"").append(`resultsPerPage`.get).append("\"").append(',') }
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object SimpleRequest {
	@scala.beans.BeanProperty val defaultInstance = new SimpleRequest()

	def parseFrom(data: Array[Byte]): SimpleRequest = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): SimpleRequest = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf2.ByteString): SimpleRequest = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): SimpleRequest = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[SimpleRequest] = defaultInstance.mergeDelimitedFromStream(stream)

	val QUERY_FIELD_NUMBER = 1
	val PAGE_NUMBER_FIELD_NUMBER = 2
	val RESULTS_PER_PAGE_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: SimpleRequest) = defaultInstance.mergeFrom(prototype)

}

object SimpleWithComments {
	def registerAllExtensions(registry: com.google.protobuf2.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf2.GeneratedMessageLite](
		 "SimpleRequest" -> (bytes ⇒ SimpleRequest.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf2.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}