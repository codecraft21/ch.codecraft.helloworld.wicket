libraryDependencies <+= sbtVersion(v => v match {
  case x if (x.startsWith("0.12")) => "com.github.siasia" %% "xsbt-web-plugin" % "0.12.0-0.2.11.1"
})

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.0")

