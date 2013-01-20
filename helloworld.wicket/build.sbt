name := "helloworld.wicket"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies += "org.apache.wicket" % "wicket-core" % "6.4.0"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

seq(webSettings :_*)

libraryDependencies += "org.eclipse.jetty.aggregate" % "jetty-all-server" % "8.1.8.v20121106" % "provided"

libraryDependencies += "org.eclipse.jetty.aggregate" % "jetty-all-server" % "8.1.8.v20121106" % "container"

net.virtualvoid.sbt.graph.Plugin.graphSettings

