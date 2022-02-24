package com.janson

class Human (var weight: Float,var height:Float) {
    init {
        println("test + $weight")
    }
    fun bmi():Float{
        val bmi= weight /(height*height);
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin")
    }
}