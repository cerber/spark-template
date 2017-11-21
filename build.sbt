name := "spark-template"

version := "0.0.1"

scalaVersion := "2.11.11"

sparkVersion := "2.2.0"
sparkComponents ++= Seq("sql")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "_" + sv.binary + "-" + sparkVersion.value + "_" + module.revision + "." + artifact.extension
}
