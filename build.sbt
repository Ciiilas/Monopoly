val scala3Version = "3.4.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Monopoly",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.18",
      "org.scalatest" %% "scalatest" % "3.2.18" % "test"
    )
  )
