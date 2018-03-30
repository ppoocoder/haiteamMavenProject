package com.haiteam

import org.apache.spark.sql.SparkSession

object Example_01 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Example_01 Project").
      config("spark.master","local").
    getOrCreate()

    var staticUrl = "jdbc:postgresql://192.168.110.111:5432/kopo"
    var staticUser ="kopo"
    var staticPw ="kopo"
    var selloutDb ="kopo_channel_seasonality"

    val selloutDataFromPg = spark.read.format("jdbc").
      options(Map("url"->staticUrl,"dbtable"->selloutDb,"user"->staticUser,"password"->staticPw)).load


    selloutDataFromPg.createOrReplaceTempView("selloutTable")

    selloutDataFromPg.show()

  }
}
