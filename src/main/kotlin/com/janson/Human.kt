package com.janson

class Human(var weight: Float,var height:Float) {
    fun bmi():Float{
        val bmi= weight /(height*height);
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin")
    }
}