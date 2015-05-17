import _root_.sbt._

name := "play-example-mysql"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.21"
)

lazy val root = (project in file(".")).enablePlugins(play.PlayJava)

fork in run := true