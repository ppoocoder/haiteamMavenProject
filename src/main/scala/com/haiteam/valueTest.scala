package com.haiteam

object valueTest {

  def main(args: Array[String]) {

    var intValue = 10
    var doubleValue = 10

    var sumValue = intValue + doubleValue
    var multipleValue = intValue * doubleValue
    var divisionValue = intValue / doubleValue
    var expValue = Math.pow(intValue, doubleValue)
    var modValue = intValue % doubleValue


    println(sumValue)
    println(multipleValue)
    println(divisionValue)
    println(expValue)
    println(modValue)

    var year ="2018"
    var week= "01W"

    var yearweek = year+ week
    yearweek = "2018"+"01W"
    // split , replace, lengthm , toString,substring, toInt, toDouble

    var priceList = List(8000,9000,2000,11000)

    var listSize = priceList.size

    var minPrice = priceList.min
    var maxPrice = priceList.max
    println("size :" +listSize +", min :" + minPrice+", max: "+ maxPrice )
    //리스트추가
    priceList = priceList ++ List(9000)
    println(priceList)
    //리스트삭제
    priceList = priceList.filter(x=>{x!=minPrice})
    println(priceList)
    //리스트정렬(sortBy , sortWith)
    priceList = priceList.sortBy(x=>{x})
    println(priceList)
    priceList = priceList.sortBy(x=>{-x})
    println(priceList)
    priceList = priceList.sortWith(_<_)
    println(priceList)
    priceList = priceList.sortWith(_>_)
    println(priceList)
  }
}