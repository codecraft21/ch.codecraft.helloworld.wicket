import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "roster"

version := "0.1"

scalaVersion := "2.10.1"

mainClass := Some("JettyLauncher")

scalacOptions := Seq("-deprecation", "-encoding", "utf8")

libraryDependencies += "org.apache.wicket" % "wicket-core" % "1.5.4"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.2"

libraryDependencies += "log4j" % "log4j" % "1.2.16"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

//libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container, compile"

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "compile;container"

libraryDependencies += "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))

seq(webSettings :_*)

