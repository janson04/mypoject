package com.janson.kotlin

class Human (var weight: Float, var height:Float, var name:String = "") {
    init {
        println("test + $weight")
    }
//    constructor(name:String,weight: Float,height: Float) : this(weight,height)
    fun bmi():Float{
        val bmi= weight /(height*height);
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin")
    }
}