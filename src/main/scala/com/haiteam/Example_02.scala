package com.haiteam

import org.apache.spark.sql.SparkSession

object Example_02 {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Example_02Project").
      config("spark.master","local").
      getOrCreate()


    var staticUrl ="jdbc:mysql://192.168.110.112:3306/kopo"
    var staticUser = "root"
    var staticPw ="P@ssw0rd"
    var staticDb ="KOPO_PRODUCT_VOLUME"
    val selloutDataFromMysql =spark.read.format("jdbc").
      options(Map("url"->staticUrl,"dbtable"->staticDb,"user"->staticUser,"password"->staticPw)).load

    selloutDataFromMysql.createOrReplaceTempView("selloutTable")

    selloutDataFromMysql.show()
  }
}
