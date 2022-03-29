package com.janson

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://tcgbusfs.blob.core.windows.net/blobtcmsv/TCMSV_alldesc.json")
//    val url = URL("http://atm201605.appspot.com/h")

    //方法四
    println(url.readText())

    /*
    with(url.openConnection() as HttpURLConnection) {
        //方法三
        val inn = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
        //方法二
//        val inn = inputStream.bufferedReader()
//        var line = inn.readLine()
//        val json = StringBuffer()
//        while (line != null) {
//            json.append(line)
//            line = inn.readLine()
//        }
//        println(json.toString())
    }

     */


//方法一 同JAVA
//    val connection = url.openConnection() as HttpURLConnection
//    val iss = connection.inputStream
//    val inn = BufferedReader(InputStreamReader(iss))
//    var line = inn.readLine()
//    val json = StringBuffer()
//    while (line != null) {
//        json.append(line)
//        line = inn.readLine()
//    }
//    println(json.toString())
}