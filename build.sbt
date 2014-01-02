name := "scalatemplate"

version := "0.1.0"

scalaVersion := "2.10.3"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies ++= Seq(
  "commons-lang" % "commons-lang" % "2.6"
)

