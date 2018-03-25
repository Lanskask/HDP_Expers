
scalaVersion := "2.12.4"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

// libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"
// libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"

resolvers += "Apache HBase" at "https://repository.apache.org/content/repositories/releases"

resolvers += "Thrift" at "https://people.apache.org/~rawson/repo/"
// resolvers += Resolver.url("ClouderaRepo", url("https://repository.cloudera.com/content/repositories/releases"))
// resolvers += "ClouderaRepo" at "https://repository.cloudera.com/content/repositories/releases"

libraryDependencies ++= Seq(
    "org.apache.hadoop" % "hadoop-core" % "0.20.2",
    "org.apache.hbase" % "hbase" % "0.90.4"
)

ivyXML :=
  <dependencies>
    <exclude module="thrift"/>
  </dependencies>