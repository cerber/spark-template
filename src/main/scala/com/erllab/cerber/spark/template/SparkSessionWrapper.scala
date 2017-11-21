package com.erllab.cerber.spark.template

import org.apache.spark.sql.SparkSession

trait SparkSessionWrapper {

  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .master("local")
      .appName("spark template")
      .getOrCreate()
  }

}
