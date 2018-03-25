import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Try2FoSbtScript",
    libraryDependencies += scalaTest % Test,
    resolvers += "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
    resolvers += "Thrift" at "https://people.apache.org/~rawson/repo/",
    /*libraryDependencies ++= Seq(
      "org.apache.hadoop" % "hadoop-core" % "0.20.2",
      "org.apache.hbase" % "hbase" % "0.99.2"
    ),*/
    libraryDependencies ++= Seq(
      "org.apache.hadoop" % "hadoop-core" % "1.2.1",
      "org.apache.hbase" % "hbase" % "1.2.0",
      "org.apache.hbase" % "hbase-client" % "1.2.0",
      "org.apache.hbase" % "hbase-common" % "1.2.0",
      "org.apache.hbase" % "hbase-server" % "1.2.0"
    ),
    ivyXML :=
      <dependencies>
        <exclude module="thrift"/>
      </dependencies>

  )
