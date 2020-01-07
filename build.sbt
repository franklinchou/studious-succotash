name := "studious-succotash"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.1.0",
  "org.scalatest" %% "scalatest" % "3.1.0" % "test",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-csv" % "2.10.2"
)