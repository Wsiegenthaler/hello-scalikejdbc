import sbt._, Keys._
import play.Project._

object DevTeamBuild extends Build {

  lazy val scalikejdbcVersion = "1.7.0"
  lazy val h2Version = "1.3.172"

  lazy val app = {
    val appName         = "hello-scalikejdbc"
    val appVersion      = "0.1"
    val appDependencies = Seq(
      "org.scalikejdbc"      %% "scalikejdbc"                     % scalikejdbcVersion,
      "org.scalikejdbc"      %% "scalikejdbc-config"              % scalikejdbcVersion,
      "org.scalikejdbc"      %% "scalikejdbc-interpolation"       % scalikejdbcVersion,
      "org.scalikejdbc"      %% "scalikejdbc-play-plugin"         % scalikejdbcVersion,
      "org.scalikejdbc"      %% "scalikejdbc-play-fixture-plugin" % scalikejdbcVersion,
      "com.h2database"       %  "h2"                              % "1.3.174",
      "org.hibernate"        %  "hibernate-core"                  % "4.2.3.Final",
      "org.json4s"           %% "json4s-ext"                      % "3.2.4",
      "com.github.tototoshi" %% "play-json4s-native"              % "0.1.0",
      "com.github.tototoshi" %% "play-flyway"                     % "0.1.4",
      "org.webjars"          %% "webjars-play"                    % "2.1.0-2",
      "org.webjars"          %  "jquery"                          % "1.10.2",
      "org.webjars"          %  "backbonejs"                      % "1.0.0-1",
      "org.webjars"          %  "underscorejs"                    % "1.5.1",
      "org.webjars"          %  "bootstrap"                       % "2.3.2",
      "org.scalikejdbc"      %% "scalikejdbc-test"                % scalikejdbcVersion  % "test",
      "org.specs2"           %% "specs2"                          % "2.1"               % "test"
    )
    play.Project(appName, appVersion, appDependencies).settings(
      scalaVersion in ThisBuild := "2.10.3",
      conflictWarning := ConflictWarning.disable
    )
  }

}
