name := "jdbc-mapping"

version := "1.0-SNAP"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.13"

resolvers += Resolver.jcenterRepo

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
// https://mvnrepository.com/artifact/com.typesafe.slick/slick
libraryDependencies += "com.typesafe.slick" %% "slick" % "3.2.3"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3"// % Provided




