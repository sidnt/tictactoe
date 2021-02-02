lazy val root = project
  .in(file("."))
  .settings(
    scalaVersion := "3.0.0-M3",
    name := "tictactoe",
    version := "0.1.0",
    libraryDependencies += "dev.zio" %% "zio" % "1.0.4-1"
  )
