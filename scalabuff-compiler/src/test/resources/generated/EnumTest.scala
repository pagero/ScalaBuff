// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: enum.proto

package resources.generated

object ComputerPeripherals extends net.sandrogrzicic.scalabuff.Enum {
	sealed trait EnumVal extends Value
	val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

	val MOUSE = new EnumVal { val name = "MOUSE"; val id = 1 }
	val KEYBOARD = new EnumVal { val name = "KEYBOARD"; val id = 2 }

	val MOUSE_VALUE = 1
	val KEYBOARD_VALUE = 2

	def valueOf(id: Int) = id match {
		case 1 => MOUSE
		case 2 => KEYBOARD
		case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
	}
	val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
		def findValueByNumber(id: Int): EnumVal = valueOf(id)
	}
}
final case class Outer (
	`innerRequired`: Outer.Inner.EnumVal = Outer.Inner._UNINITIALIZED,
	`innerOptional`: Option[Outer.Inner.EnumVal] = Some(Outer.Inner.FIRST),
	`innerRepeated`: collection.immutable.Seq[Outer.Inner.EnumVal] = Vector.empty[Outer.Inner.EnumVal]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Outer]
	with net.sandrogrzicic.scalabuff.Parser[Outer] {

	def setInnerOptional(_f: Outer.Inner.EnumVal) = copy(`innerOptional` = Some(_f))
	def setInnerRepeated(_i: Int, _v: Outer.Inner.EnumVal) = copy(`innerRepeated` = `innerRepeated`.updated(_i, _v))
	def addInnerRepeated(_f: Outer.Inner.EnumVal) = copy(`innerRepeated` = `innerRepeated` :+ _f)
	def addAllInnerRepeated(_f: Outer.Inner.EnumVal*) = copy(`innerRepeated` = `innerRepeated` ++ _f)
	def addAllInnerRepeated(_f: TraversableOnce[Outer.Inner.EnumVal]) = copy(`innerRepeated` = `innerRepeated` ++ _f)

	def clearInnerOptional = copy(`innerOptional` = None)
	def clearInnerRepeated = copy(`innerRepeated` = Vector.empty[Outer.Inner.EnumVal])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeEnum(1, `innerRequired`)
		if (`innerOptional`.isDefined) output.writeEnum(2, `innerOptional`.get)
		for (_v <- `innerRepeated`) output.writeEnum(3, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeEnumSize(1, `innerRequired`)
		if (`innerOptional`.isDefined) __size += computeEnumSize(2, `innerOptional`.get)
		for (_v <- `innerRepeated`) __size += computeEnumSize(3, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Outer = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __innerRequired: Outer.Inner.EnumVal = Outer.Inner._UNINITIALIZED
		var __innerOptional: Option[Outer.Inner.EnumVal] = `innerOptional`
		val __innerRepeated: collection.mutable.Buffer[Outer.Inner.EnumVal] = `innerRepeated`.toBuffer

		def __newMerged = Outer(
			__innerRequired,
			__innerOptional,
			Vector(__innerRepeated: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __innerRequired = Outer.Inner.valueOf(in.readEnum())
			case 16 => __innerOptional = Some(Outer.Inner.valueOf(in.readEnum()))
			case 24 => __innerRepeated += Outer.Inner.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Outer) = {
		Outer(
			m.`innerRequired`,
			m.`innerOptional`.orElse(`innerOptional`),
			`innerRepeated` ++ m.`innerRepeated`
		)
	}

	def getDefaultInstanceForType = Outer.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = parseFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object Outer {
	@reflect.BeanProperty val defaultInstance = new Outer()

	def parseFrom(data: Array[Byte]): Outer = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Outer = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Outer = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Outer = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Outer] = defaultInstance.mergeDelimitedFromStream(stream)

	val INNER_REQUIRED_FIELD_NUMBER = 1
	val INNER_OPTIONAL_FIELD_NUMBER = 2
	val INNER_REPEATED_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Outer) = defaultInstance.mergeFrom(prototype)

	object Inner extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val FIRST = new EnumVal { val name = "FIRST"; val id = 1 }
		val SECOND = new EnumVal { val name = "SECOND"; val id = 2 }

		val FIRST_VALUE = 1
		val SECOND_VALUE = 2

		def valueOf(id: Int) = id match {
			case 1 => FIRST
			case 2 => SECOND
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

}
final case class OuterDuplicate (
	`innerRequired`: OuterDuplicate.Inner.EnumVal = OuterDuplicate.Inner._UNINITIALIZED,
	`innerOptional`: Option[OuterDuplicate.Inner.EnumVal] = Some(OuterDuplicate.Inner.SECOND),
	`innerRepeated`: collection.immutable.Seq[OuterDuplicate.Inner.EnumVal] = Vector.empty[OuterDuplicate.Inner.EnumVal]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[OuterDuplicate]
	with net.sandrogrzicic.scalabuff.Parser[OuterDuplicate] {

	def setInnerOptional(_f: OuterDuplicate.Inner.EnumVal) = copy(`innerOptional` = Some(_f))
	def setInnerRepeated(_i: Int, _v: OuterDuplicate.Inner.EnumVal) = copy(`innerRepeated` = `innerRepeated`.updated(_i, _v))
	def addInnerRepeated(_f: OuterDuplicate.Inner.EnumVal) = copy(`innerRepeated` = `innerRepeated` :+ _f)
	def addAllInnerRepeated(_f: OuterDuplicate.Inner.EnumVal*) = copy(`innerRepeated` = `innerRepeated` ++ _f)
	def addAllInnerRepeated(_f: TraversableOnce[OuterDuplicate.Inner.EnumVal]) = copy(`innerRepeated` = `innerRepeated` ++ _f)

	def clearInnerOptional = copy(`innerOptional` = None)
	def clearInnerRepeated = copy(`innerRepeated` = Vector.empty[OuterDuplicate.Inner.EnumVal])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeEnum(1, `innerRequired`)
		if (`innerOptional`.isDefined) output.writeEnum(2, `innerOptional`.get)
		for (_v <- `innerRepeated`) output.writeEnum(3, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeEnumSize(1, `innerRequired`)
		if (`innerOptional`.isDefined) __size += computeEnumSize(2, `innerOptional`.get)
		for (_v <- `innerRepeated`) __size += computeEnumSize(3, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): OuterDuplicate = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __innerRequired: OuterDuplicate.Inner.EnumVal = OuterDuplicate.Inner._UNINITIALIZED
		var __innerOptional: Option[OuterDuplicate.Inner.EnumVal] = `innerOptional`
		val __innerRepeated: collection.mutable.Buffer[OuterDuplicate.Inner.EnumVal] = `innerRepeated`.toBuffer

		def __newMerged = OuterDuplicate(
			__innerRequired,
			__innerOptional,
			Vector(__innerRepeated: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __innerRequired = OuterDuplicate.Inner.valueOf(in.readEnum())
			case 16 => __innerOptional = Some(OuterDuplicate.Inner.valueOf(in.readEnum()))
			case 24 => __innerRepeated += OuterDuplicate.Inner.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: OuterDuplicate) = {
		OuterDuplicate(
			m.`innerRequired`,
			m.`innerOptional`.orElse(`innerOptional`),
			`innerRepeated` ++ m.`innerRepeated`
		)
	}

	def getDefaultInstanceForType = OuterDuplicate.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = parseFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object OuterDuplicate {
	@reflect.BeanProperty val defaultInstance = new OuterDuplicate()

	def parseFrom(data: Array[Byte]): OuterDuplicate = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): OuterDuplicate = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): OuterDuplicate = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): OuterDuplicate = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[OuterDuplicate] = defaultInstance.mergeDelimitedFromStream(stream)

	val INNER_REQUIRED_FIELD_NUMBER = 1
	val INNER_OPTIONAL_FIELD_NUMBER = 2
	val INNER_REPEATED_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: OuterDuplicate) = defaultInstance.mergeFrom(prototype)

	object Inner extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val FIRST = new EnumVal { val name = "FIRST"; val id = 1 }
		val SECOND = new EnumVal { val name = "SECOND"; val id = 2 }

		val FIRST_VALUE = 1
		val SECOND_VALUE = 2

		def valueOf(id: Int) = id match {
			case 1 => FIRST
			case 2 => SECOND
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

}
final case class OuterEnumContainer (
	`innerMessage`: OuterEnumContainer.InnerEnumContainer = OuterEnumContainer.InnerEnumContainer.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[OuterEnumContainer]
	with net.sandrogrzicic.scalabuff.Parser[OuterEnumContainer] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `innerMessage`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `innerMessage`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): OuterEnumContainer = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __innerMessage: OuterEnumContainer.InnerEnumContainer = OuterEnumContainer.InnerEnumContainer.defaultInstance

		def __newMerged = OuterEnumContainer(
			__innerMessage
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __innerMessage = readMessage[OuterEnumContainer.InnerEnumContainer](in, __innerMessage, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: OuterEnumContainer) = {
		OuterEnumContainer(
			m.`innerMessage`
		)
	}

	def getDefaultInstanceForType = OuterEnumContainer.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = parseFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object OuterEnumContainer {
	@reflect.BeanProperty val defaultInstance = new OuterEnumContainer()

	def parseFrom(data: Array[Byte]): OuterEnumContainer = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): OuterEnumContainer = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): OuterEnumContainer = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): OuterEnumContainer = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[OuterEnumContainer] = defaultInstance.mergeDelimitedFromStream(stream)

	val INNER_MESSAGE_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: OuterEnumContainer) = defaultInstance.mergeFrom(prototype)

	final case class InnerEnumContainer (
		`someEnum`: InnerEnumContainer.SomeEnum.EnumVal = InnerEnumContainer.SomeEnum._UNINITIALIZED
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[InnerEnumContainer]
		with net.sandrogrzicic.scalabuff.Parser[InnerEnumContainer] {



		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeEnum(1, `someEnum`)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			__size += computeEnumSize(1, `someEnum`)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): InnerEnumContainer = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __someEnum: InnerEnumContainer.SomeEnum.EnumVal = InnerEnumContainer.SomeEnum._UNINITIALIZED

			def __newMerged = InnerEnumContainer(
				__someEnum
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __someEnum = InnerEnumContainer.SomeEnum.valueOf(in.readEnum())
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: InnerEnumContainer) = {
			InnerEnumContainer(
				m.`someEnum`
			)
		}

		def getDefaultInstanceForType = InnerEnumContainer.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = parseFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
	}

	object InnerEnumContainer {
		@reflect.BeanProperty val defaultInstance = new InnerEnumContainer()

		def parseFrom(data: Array[Byte]): InnerEnumContainer = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): InnerEnumContainer = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): InnerEnumContainer = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): InnerEnumContainer = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[InnerEnumContainer] = defaultInstance.mergeDelimitedFromStream(stream)

		val SOME_ENUM_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: InnerEnumContainer) = defaultInstance.mergeFrom(prototype)

		object SomeEnum extends net.sandrogrzicic.scalabuff.Enum {
			sealed trait EnumVal extends Value
			val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

			val VALUE_1 = new EnumVal { val name = "VALUE_1"; val id = 0 }
			val VALUE_2 = new EnumVal { val name = "VALUE_2"; val id = 1 }
			val VALUE_3 = new EnumVal { val name = "VALUE_3"; val id = 2 }

			val VALUE_1_VALUE = 0
			val VALUE_2_VALUE = 1
			val VALUE_3_VALUE = 2

			def valueOf(id: Int) = id match {
				case 0 => VALUE_1
				case 1 => VALUE_2
				case 2 => VALUE_3
				case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
			}
			val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
				def findValueByNumber(id: Int): EnumVal = valueOf(id)
			}
		}

	}
}

object EnumTest {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
