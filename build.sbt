// Project

name := "Jetty Websocket Tester"

organization := "Bluetheta"

version := "2.0"


// SBT

scalaSource in Compile <<= baseDirectory / "src"


// Scala

scalaVersion := "2.9.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")


// Managed libraries

libraryDependencies ++= Seq(
  "org.eclipse.jetty"  % "jetty-client"    % "7.4.2.v20110526" % "compile,test",
  "org.eclipse.jetty"  % "jetty-webapp"    % "7.4.2.v20110526" % "compile,test",
  "org.eclipse.jetty"  % "jetty-websocket" % "7.4.2.v20110526" % "compile,test"
)
