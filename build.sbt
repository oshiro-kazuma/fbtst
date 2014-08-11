import play.PlayScala
import com.tuplejump.sbt.yeoman.Yeoman

name := """fbtst"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

Yeoman.yeomanSettings

//Yeoman.withTemplates
