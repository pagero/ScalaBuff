// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: import_packages.proto

package resources.generated

//import "package_name.proto"

final case class UsesImportPackage (
	`packageTest`: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[UsesImportPackage]
	with net.sandrogrzicic.scalabuff.Parser[UsesImportPackage] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `packageTest`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `packageTest`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): UsesImportPackage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __packageTest: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance

		def __newMerged = UsesImportPackage(
			__packageTest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __packageTest = readMessage[resources.generated.nested.PackageTest](in, __packageTest, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: UsesImportPackage) = {
		UsesImportPackage(
			m.`packageTest`
		)
	}

	def getDefaultInstanceForType = UsesImportPackage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = parseFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object UsesImportPackage {
	@reflect.BeanProperty val defaultInstance = new UsesImportPackage()

	def parseFrom(data: Array[Byte]): UsesImportPackage = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): UsesImportPackage = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): UsesImportPackage = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): UsesImportPackage = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[UsesImportPackage] = defaultInstance.mergeDelimitedFromStream(stream)

	val PACKAGE_TEST_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: UsesImportPackage) = defaultInstance.mergeFrom(prototype)

}

object ImportPackages {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
