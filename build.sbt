name := "scala-app"

version := "1.0"

scalaVersion := "2.12.11"

val scalatestVersion = "3.2.5"
val sparkVersion = "3.1.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalatestVersion,
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion
)

idePackagePrefix := Some("ru.shatrov")
