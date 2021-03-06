At this point, the differences between Sandro Grzicic's repo and this one are so vast that this should really be considered a fork. This means, we will likely rename packages and/or domains sometime soon, to avoid confusion.

*NOTE!!!* This forked repo is not available on any public repository at this point, so be aware that you probably need to build it yourself.

*NOTE!!!* This is a patched version that depends on a special version of protobuf 2. The thing that is special is that
the package name of protobuf is changed from com.google.protobuf to com.google.protobuf2. This makes it possible to 
coexist with protobuf 3 that also use the same package name, but is not compatible with the old protobuf 2 packages
that ScalaBuff uses. This makes it possible to use newer protobuf 3 together with ScalaBuff.

Use on your own risk. :-)

ScalaBuff is a Scala [Protocol Buffers](https://developers.google.com/protocol-buffers/docs/overview) (protobuf) compiler. It takes .proto files and outputs valid Scala classes that can be used by your code to receive or send protobuf messages.

Both the ScalaBuff generator and the generated Scala classes depend on Google's Java runtime for Protocol Buffers, which is provided with ScalaBuff.

If you just want to use ScalaBuff-generated classes in your SBT-managed project, here's the dependency to add (located on the Sonatype OSS repository): `"net.sandrogrzicic" %% "scalabuff-runtime" % "[desired_version]"`
The latest release is **1.4.0-5pb2** with support for Scala 2.11 and 2.12. Support for 2.10 has been removed from version 1.4.0-2pb2.

For any questions or general discussion, you can use the [ScalaBuff Google Group](https://groups.google.com/forum/#!forum/scalabuff) but please feel free to [create new issues](https://github.com/pagero/ScalaBuff/issues/new) for bug reports or feature requests. Thanks!

