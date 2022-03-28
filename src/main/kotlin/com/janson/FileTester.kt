package com.janson

import java.io.File

fun main() {
//    File("output.txt").writeText("cdf123")
//    printwriter()
//    bufferedwriter()
    println(File("data.txt").bufferedReader().readLine())
//    File("data.txt").bufferedReader().lines().forEach {
//        println(it)
//    }
}

private fun bufferedwriter() {
    File("output.txt").bufferedWriter().use {
        it.write("1st line buffer\n")
        it.write("2nd line")
    }
}

private fun printwriter() {
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
    }
}