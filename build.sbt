releaseSettings

ReleaseKeys.crossBuild := true

name := "scala-pdf"

organization := "net.kaliber"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.10.4", "2.11.4", scalaVersion.value)

libraryDependencies ++= Seq(
  "org.xhtmlrenderer" % "flying-saucer-core" % "9.0.8",
  "org.xhtmlrenderer" % "flying-saucer-pdf" % "9.0.8",
  "net.sf.jtidy" % "jtidy" % "r938",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

publishTo :=
  Some("Kaliber Repository" at "https://jars.kaliber.io/artifactory/libs-release-local")
