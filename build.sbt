name := """SOFE3700Project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  javaJdbc,
  cache,
  javaWs,
  "org.xerial" % "sqlite-jdbc" % "3.15.0"
)

resolvers += "SQLite-JDBC Repository" at "https://oss.sonatype.org/content/repositories/snapshots"