name := "HbaseTest2"

version := "0.1"

scalaVersion := "2.12.4"

resolvers := Seq("Apache HBase" at "https://repository.apache.org/content/repositories/releases")
resolvers := Seq("Thrift" at "https://people.apache.org/~rawson/repo/")

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-core" % "0.20.2",
  "org.apache.hbase" % "hbase" % "0.90.4"
)