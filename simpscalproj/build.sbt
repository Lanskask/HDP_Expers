
// organization := "com.example"

// scalaVersion := "2.12.4"
// // scalaVersion := "2.10.0"

// version      := "0.1.0-SNAPSHOT"
// // version := "1.0"

// name := "SimpScalProj"

// // libraryDependencies += scalaTest % Test
// libraryDependencies += "org.scalatest" % "scalatest" % "1.9.1"// % "test"

// import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
//      scalaVersion := "2.10",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "SimpScalProj",
    // libraryDependencies += scalaTest % Test
	// libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1"// % "test"
	 libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,

    ivyXML :=
      <dependencies>
        <exclude module="thrift"/>
      </dependencies>
//	libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % Test
  )
