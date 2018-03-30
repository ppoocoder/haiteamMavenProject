package com.haiteam

object Example_04 {
  def main(args: Array[String]): Unit = {
    def powd(d:Int):Double = {
      var op =1
      for( i <-0 until d){
      op=op*10
      }
      op
    }

    var test = powd(2)
  }
}
