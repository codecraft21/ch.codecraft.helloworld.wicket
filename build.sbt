name := "roster"

version := "0.1"

scalaVersion := "2.10.1"

libraryDependencies += "org.apache.wicket" % "wicket-core" % "1.5.4"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.2"

libraryDependencies += "log4j" % "log4j" % "1.2.16"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"

seq(webSettings :_*)

