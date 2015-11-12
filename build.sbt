lazy val root = (project in file(".")).
  settings(
    exportJars := true,
    name := "sparkss",
    version := "1.0",
    scalaVersion := "2.10.6",
    libraryDependencies ++= Seq(
      "org.apache.spark" % "spark-core_2.10" % "1.5.2",
      "com.github.nscala-time" %% "nscala-time" % "2.4.0",
      "joda-time" % "joda-time" % "2.9",
      "io.spray" %%  "spray-json" % "1.3.2",
      "org.scalatest" %% "scalatest" % "2.2.4" % Test
    )
  )

