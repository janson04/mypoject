package com.janson.guess

import java.util.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`);
    val secert = Random().nextInt(10) + 1
    println(secert)
    for (i in 1..5) {
        print("請輸入一個數字($i/5)：")
        var number = scanner.nextInt();
        if (number < secert) {
            println("再猜大一點")
        } else if (number > secert) {
            println("再猜小一點")
        } else {
            println("恭喜猜對了，數字是$secert")
            break
        }
        if (number == -1)
            break
    }
    println("結束")
}