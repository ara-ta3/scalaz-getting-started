scalaVersion := "2.13.4"

val scalazVersion = "7.3.3"
val scalazScalaCheckBindingVersion = s"$scalazVersion-scalacheck-1.14"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazScalaCheckBindingVersion % Test
)

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"

initialCommands in console in Test := "import scalaz._, Scalaz._, scalacheck.ScalazProperties._, scalacheck.ScalazArbitrary._,scalacheck.ScalaCheckBinding._"
