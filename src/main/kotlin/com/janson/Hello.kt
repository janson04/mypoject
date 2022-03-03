package com.janson

fun main() {
//    println("Hello World")
//    Human().hello()
    var s : String? = "efaxz";
//    s = null;
    println(s!!.length);
    println(s?.get(3));
    println(s?.substring(2,4))
    val h=Human(66.5f,1.7f);
    println(h.bmi());
    val score = 88;
    println(score > 60);
    val c:Char='A';
    println(c.toInt() > 60)
    h.hello();
}