package com.janson.guess

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("請猜一個數字：")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number < secret) println("您猜的是$number,請再猜大一點") else println("您猜的是$number,請再猜小一點")
    }
    println("恭喜猜對了，謎底是 $secret")
}