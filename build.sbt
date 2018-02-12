name := "scraper-template"

version := "0.1"

scalaVersion := "2.12.4"


libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.19",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "com.typesafe.play" %% "play-json" % "2.6.8",
  "org.scalikejdbc" %% "scalikejdbc"       % "3.2.1",
  "org.scalikejdbc" %% "scalikejdbc-config" % "3.2.1",
  "mysql" % "mysql-connector-java" % "6.0.6",
  "ch.qos.logback"  %  "logback-classic"   % "1.2.3",

  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

flywayUrl := "jdbc:mysql://localhost/scraping_db"
flywayUser := "scraping_user"
flywayPassword := "scraping_password"