// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: nestedMessages.proto

package resources.generated

final case class TopLevel (
	`idToplevel`: Int = 0
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[TopLevel]
	with net.sandrogrzicic.scalabuff.Parser[TopLevel] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeUInt32(1, `idToplevel`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeUInt32Size(1, `idToplevel`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): TopLevel = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __idToplevel: Int = 0

		def __newMerged = TopLevel(
			__idToplevel
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __idToplevel = in.readUInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: TopLevel) = {
		TopLevel(
			m.`idToplevel`
		)
	}

	def getDefaultInstanceForType = TopLevel.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"idToplevel\": ").append("\"").append(`idToplevel`).append("\"").append(',')
		sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object TopLevel {
	@reflect.BeanProperty val defaultInstance = new TopLevel()

	def parseFrom(data: Array[Byte]): TopLevel = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): TopLevel = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): TopLevel = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): TopLevel = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[TopLevel] = defaultInstance.mergeDelimitedFromStream(stream)

	val ID_TOPLEVEL_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: TopLevel) = defaultInstance.mergeFrom(prototype)

	final case class Inner (
		`idInner`: Int = 0
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Inner]
		with net.sandrogrzicic.scalabuff.Parser[Inner] {



		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeUInt32(1, `idInner`)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			__size += computeUInt32Size(1, `idInner`)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Inner = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __idInner: Int = 0

			def __newMerged = Inner(
				__idInner
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __idInner = in.readUInt32()
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Inner) = {
			Inner(
				m.`idInner`
			)
		}

		def getDefaultInstanceForType = Inner.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				sb.append(indent1).append("\"idInner\": ").append("\"").append(`idInner`).append("\"").append(',')
			sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Inner {
		@reflect.BeanProperty val defaultInstance = new Inner()

		def parseFrom(data: Array[Byte]): Inner = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Inner = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Inner = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Inner = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Inner] = defaultInstance.mergeDelimitedFromStream(stream)

		val ID_INNER_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Inner) = defaultInstance.mergeFrom(prototype)

	}
}
final case class Foobar (
	`reqFoo`: Foobar.Foo = Foobar.Foo.defaultInstance,
	`optFoo`: Option[Foobar.Foo] = None,
	`optBar`: Option[Foobar.Bar] = None,
	`repFoo`: scala.collection.immutable.Seq[Foobar.Foo] = Vector.empty[Foobar.Foo],
	`repBar`: scala.collection.immutable.Seq[Foobar.Bar] = Vector.empty[Foobar.Bar],
	`repFooBar`: scala.collection.immutable.Seq[Foobar.FooBar] = Vector.empty[Foobar.FooBar],
	`topLevelReq`: TopLevel = TopLevel.defaultInstance,
	`topLevelOpt`: Option[TopLevel] = None,
	`topLevelInnerReq`: TopLevel.Inner = TopLevel.Inner.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Foobar]
	with net.sandrogrzicic.scalabuff.Parser[Foobar] {

	def setOptFoo(_f: Foobar.Foo) = copy(`optFoo` = Some(_f))
	def setOptBar(_f: Foobar.Bar) = copy(`optBar` = Some(_f))
	def setRepFoo(_i: Int, _v: Foobar.Foo) = copy(`repFoo` = `repFoo`.updated(_i, _v))
	def addRepFoo(_f: Foobar.Foo) = copy(`repFoo` = `repFoo` :+ _f)
	def addAllRepFoo(_f: Foobar.Foo*) = copy(`repFoo` = `repFoo` ++ _f)
	def addAllRepFoo(_f: TraversableOnce[Foobar.Foo]) = copy(`repFoo` = `repFoo` ++ _f)
	def setRepBar(_i: Int, _v: Foobar.Bar) = copy(`repBar` = `repBar`.updated(_i, _v))
	def addRepBar(_f: Foobar.Bar) = copy(`repBar` = `repBar` :+ _f)
	def addAllRepBar(_f: Foobar.Bar*) = copy(`repBar` = `repBar` ++ _f)
	def addAllRepBar(_f: TraversableOnce[Foobar.Bar]) = copy(`repBar` = `repBar` ++ _f)
	def setRepFooBar(_i: Int, _v: Foobar.FooBar) = copy(`repFooBar` = `repFooBar`.updated(_i, _v))
	def addRepFooBar(_f: Foobar.FooBar) = copy(`repFooBar` = `repFooBar` :+ _f)
	def addAllRepFooBar(_f: Foobar.FooBar*) = copy(`repFooBar` = `repFooBar` ++ _f)
	def addAllRepFooBar(_f: TraversableOnce[Foobar.FooBar]) = copy(`repFooBar` = `repFooBar` ++ _f)
	def setTopLevelOpt(_f: TopLevel) = copy(`topLevelOpt` = Some(_f))

	def clearOptFoo = copy(`optFoo` = None)
	def clearOptBar = copy(`optBar` = None)
	def clearRepFoo = copy(`repFoo` = Vector.empty[Foobar.Foo])
	def clearRepBar = copy(`repBar` = Vector.empty[Foobar.Bar])
	def clearRepFooBar = copy(`repFooBar` = Vector.empty[Foobar.FooBar])
	def clearTopLevelOpt = copy(`topLevelOpt` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `reqFoo`)
		if (`optFoo`.isDefined) output.writeMessage(2, `optFoo`.get)
		if (`optBar`.isDefined) output.writeMessage(3, `optBar`.get)
		for (_v <- `repFoo`) output.writeMessage(4, _v)
		for (_v <- `repBar`) output.writeMessage(5, _v)
		for (_v <- `repFooBar`) output.writeMessage(6, _v)
		output.writeMessage(7, `topLevelReq`)
		if (`topLevelOpt`.isDefined) output.writeMessage(8, `topLevelOpt`.get)
		output.writeMessage(9, `topLevelInnerReq`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `reqFoo`)
		if (`optFoo`.isDefined) __size += computeMessageSize(2, `optFoo`.get)
		if (`optBar`.isDefined) __size += computeMessageSize(3, `optBar`.get)
		for (_v <- `repFoo`) __size += computeMessageSize(4, _v)
		for (_v <- `repBar`) __size += computeMessageSize(5, _v)
		for (_v <- `repFooBar`) __size += computeMessageSize(6, _v)
		__size += computeMessageSize(7, `topLevelReq`)
		if (`topLevelOpt`.isDefined) __size += computeMessageSize(8, `topLevelOpt`.get)
		__size += computeMessageSize(9, `topLevelInnerReq`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Foobar = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __reqFoo: Foobar.Foo = Foobar.Foo.defaultInstance
		var __optFoo: Option[Foobar.Foo] = `optFoo`
		var __optBar: Option[Foobar.Bar] = `optBar`
		val __repFoo: scala.collection.mutable.Buffer[Foobar.Foo] = `repFoo`.toBuffer
		val __repBar: scala.collection.mutable.Buffer[Foobar.Bar] = `repBar`.toBuffer
		val __repFooBar: scala.collection.mutable.Buffer[Foobar.FooBar] = `repFooBar`.toBuffer
		var __topLevelReq: TopLevel = TopLevel.defaultInstance
		var __topLevelOpt: Option[TopLevel] = `topLevelOpt`
		var __topLevelInnerReq: TopLevel.Inner = TopLevel.Inner.defaultInstance

		def __newMerged = Foobar(
			__reqFoo,
			__optFoo,
			__optBar,
			Vector(__repFoo: _*),
			Vector(__repBar: _*),
			Vector(__repFooBar: _*),
			__topLevelReq,
			__topLevelOpt,
			__topLevelInnerReq
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __reqFoo = readMessage[Foobar.Foo](in, __reqFoo, _emptyRegistry)
			case 18 => __optFoo = Some(readMessage[Foobar.Foo](in, __optFoo.orElse({
				__optFoo = Foobar.Foo.defaultInstance
				__optFoo
			}).get, _emptyRegistry))
			case 26 => __optBar = Some(readMessage[Foobar.Bar](in, __optBar.orElse({
				__optBar = Foobar.Bar.defaultInstance
				__optBar
			}).get, _emptyRegistry))
			case 34 => __repFoo += readMessage[Foobar.Foo](in, Foobar.Foo.defaultInstance, _emptyRegistry)
			case 42 => __repBar += readMessage[Foobar.Bar](in, Foobar.Bar.defaultInstance, _emptyRegistry)
			case 50 => __repFooBar += readMessage[Foobar.FooBar](in, Foobar.FooBar.defaultInstance, _emptyRegistry)
			case 58 => __topLevelReq = readMessage[TopLevel](in, __topLevelReq, _emptyRegistry)
			case 66 => __topLevelOpt = Some(readMessage[TopLevel](in, __topLevelOpt.orElse({
				__topLevelOpt = TopLevel.defaultInstance
				__topLevelOpt
			}).get, _emptyRegistry))
			case 74 => __topLevelInnerReq = readMessage[TopLevel.Inner](in, __topLevelInnerReq, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Foobar) = {
		Foobar(
			m.`reqFoo`,
			m.`optFoo`.orElse(`optFoo`),
			m.`optBar`.orElse(`optBar`),
			`repFoo` ++ m.`repFoo`,
			`repBar` ++ m.`repBar`,
			`repFooBar` ++ m.`repFooBar`,
			m.`topLevelReq`,
			m.`topLevelOpt`.orElse(`topLevelOpt`),
			m.`topLevelInnerReq`
		)
	}

	def getDefaultInstanceForType = Foobar.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"reqFoo\": ").append(`reqFoo`.toJson(indent + 1)).append(',')
			if (`optFoo`.isDefined) { sb.append(indent1).append("\"optFoo\": ").append(`optFoo`.get.toJson(indent + 1)).append(',') }
			if (`optBar`.isDefined) { sb.append(indent1).append("\"optBar\": ").append(`optBar`.get.toJson(indent + 1)).append(',') }
			sb.append(indent1).append("\"repFoo\": [").append(indent2).append(`repFoo`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
			sb.append(indent1).append("\"repBar\": [").append(indent2).append(`repBar`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
			sb.append(indent1).append("\"repFooBar\": [").append(indent2).append(`repFooBar`.map(_.toJson(indent + 1)).mkString(", " + indent2)).append(indent1).append(']').append(',')
			sb.append(indent1).append("\"topLevelReq\": ").append(`topLevelReq`.toJson(indent + 1)).append(',')
			if (`topLevelOpt`.isDefined) { sb.append(indent1).append("\"topLevelOpt\": ").append(`topLevelOpt`.get.toJson(indent + 1)).append(',') }
			sb.append(indent1).append("\"topLevelInnerReq\": ").append(`topLevelInnerReq`.toJson(indent + 1)).append(',')
		sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object Foobar {
	@reflect.BeanProperty val defaultInstance = new Foobar()

	def parseFrom(data: Array[Byte]): Foobar = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Foobar = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Foobar = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Foobar = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Foobar] = defaultInstance.mergeDelimitedFromStream(stream)

	val REQFOO_FIELD_NUMBER = 1
	val OPTFOO_FIELD_NUMBER = 2
	val OPTBAR_FIELD_NUMBER = 3
	val REPFOO_FIELD_NUMBER = 4
	val REPBAR_FIELD_NUMBER = 5
	val REP_FOO_BAR_FIELD_NUMBER = 6
	val TOP_LEVEL_REQ_FIELD_NUMBER = 7
	val TOP_LEVEL_OPT_FIELD_NUMBER = 8
	val TOP_LEVEL_INNER_REQ_FIELD_NUMBER = 9

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Foobar) = defaultInstance.mergeFrom(prototype)

	final case class Foo (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Foo]
		with net.sandrogrzicic.scalabuff.Parser[Foo] {

		def setId(_f: Long) = copy(`id` = Some(_f))

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (`id`.isDefined) __size += computeUInt64Size(1, `id`.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Foo = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = Foo(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = Some(in.readUInt64())
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Foo) = {
			Foo(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = Foo.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`id`.isDefined) { sb.append(indent1).append("\"id\": ").append("\"").append(`id`.get).append("\"").append(',') }
			sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Foo {
		@reflect.BeanProperty val defaultInstance = new Foo()

		def parseFrom(data: Array[Byte]): Foo = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Foo = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Foo = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Foo = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Foo] = defaultInstance.mergeDelimitedFromStream(stream)

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Foo) = defaultInstance.mergeFrom(prototype)

	}
	final case class Bar (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Bar]
		with net.sandrogrzicic.scalabuff.Parser[Bar] {

		def setId(_f: Long) = copy(`id` = Some(_f))

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (`id`.isDefined) __size += computeUInt64Size(1, `id`.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Bar = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = Bar(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = Some(in.readUInt64())
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Bar) = {
			Bar(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = Bar.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`id`.isDefined) { sb.append(indent1).append("\"id\": ").append("\"").append(`id`.get).append("\"").append(',') }
			sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object Bar {
		@reflect.BeanProperty val defaultInstance = new Bar()

		def parseFrom(data: Array[Byte]): Bar = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): Bar = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): Bar = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): Bar = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[Bar] = defaultInstance.mergeDelimitedFromStream(stream)

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Bar) = defaultInstance.mergeFrom(prototype)

	}
	final case class FooBar (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[FooBar]
		with net.sandrogrzicic.scalabuff.Parser[FooBar] {

		def setId(_f: Long) = copy(`id` = Some(_f))

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			if (`id`.isDefined) __size += computeUInt64Size(1, `id`.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): FooBar = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = FooBar(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = Some(in.readUInt64())
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: FooBar) = {
			FooBar(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = FooBar.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = {
			val indent0 = "\n" + ("\t" * indent)
			val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
			val sb = StringBuilder.newBuilder
			sb
				.append("{")
				if (`id`.isDefined) { sb.append(indent1).append("\"id\": ").append("\"").append(`id`.get).append("\"").append(',') }
			sb.length -= 1
			sb.append(indent0).append("}")
			sb.toString()
		}

	}

	object FooBar {
		@reflect.BeanProperty val defaultInstance = new FooBar()

		def parseFrom(data: Array[Byte]): FooBar = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): FooBar = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): FooBar = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): FooBar = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[FooBar] = defaultInstance.mergeDelimitedFromStream(stream)

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: FooBar) = defaultInstance.mergeFrom(prototype)

	}
}

object NestedMessages {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "TopLevel" -> (bytes ⇒ TopLevel.parseFrom(bytes)),
		 "Foobar" -> (bytes ⇒ Foobar.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
