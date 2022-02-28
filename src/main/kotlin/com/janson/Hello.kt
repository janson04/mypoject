package com.janson

fun main() {
//    println("Hello World")
//    Human().hello()
    val h=Human(66.5f,1.7f);
    println(h.bmi());
    val score = 88;
    println(score > 60);
    val c:Char='A';
    println(c.toInt() > 60)
    h.hello();
}