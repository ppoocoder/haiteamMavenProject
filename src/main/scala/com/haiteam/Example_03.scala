package com.haiteam

import org.apache.spark.sql.SparkSession

object Example_03 {

  def main(args: Array[String]): Unit = {


  val spark =SparkSession.builder().appName("Example_03Project").
    config("spark.master","local").
    getOrCreate()


  var staticUrl ="jdbc:sqlserver://192.168.110.70:1433;databaseName=kopo"
  var staticUser = "haiteam"
  var staticPw ="haiteam"
  var staticDb ="KOPO_PRODUCT_VOLUME"

  val selloutDataFromSqlserver = spark.read.format("jdbc").
    options(Map("url"->staticUrl,"dbtable"->staticDb,"user"->staticUser,"password"->staticPw)).load

  selloutDataFromSqlserver.createOrReplaceGlobalTempView("selloutTable")
  selloutDataFromSqlserver.show

}
}