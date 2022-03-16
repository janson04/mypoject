package com.janson.many

fun main() {
    map()
//    list()
}

private fun map() {
    //map
    val stocks = java.util.HashMap<String, String>()
    stocks["2330"] = "台積電"
    stocks["2317"] = "鴻海"
    stocks["2330"] = "TSMC"
    stocks["006208"] = "富邦台灣采吉50基金"
    println(stocks)
    println("------")
    println(stocks["2330"])
    println("------")
    for (key in stocks.keys) {
        println(stocks[key])
    }
}

private fun list() {
    val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(68, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))

    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)

    var list2 = mutableListOf(5, 1, 2, 7)
    list2.add(6)
    println(list2)
}