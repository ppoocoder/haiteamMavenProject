package com.haiteam

import org.apache.spark.sql.SparkSession

object Quizemode {


  def main(args: Array[String]): Unit = {
    val spark =SparkSession.builder().appName("QuizemodeProject").
      config("spark.master","local").
      getOrCreate()


    var testArray = Array(22,33,50,70,90,100)

    var answer = testArray.filter(x=>{
      var data = x%10
      data == 0
    })
      println(answer)
  }
}
