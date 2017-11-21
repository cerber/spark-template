name := "spark-template"

version := "0.0.1"

scalaVersion := "2.11.11"

sparkVersion := "2.2.0"
sparkComponents ++= Seq("sql")

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test")

spDependencies += "MrPowers/spark-fast-tests:0.4.0"
spDependencies += "mrpowers/spark-daria:2.2.0_0.12.0"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "_" + sv.binary + "-" + sparkVersion.value + "_" + module.revision + "." + artifact.extension
}
