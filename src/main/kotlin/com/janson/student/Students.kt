package com.janson.kotlin

class Students(var name: String, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

    fun print() {
        print("$name\t$english\t$math"
                + "\nAverage: "+ getAverage() + "\t" + if (getAverage() >= pass) "PASS" else "FAILED")
        println("\nGrade: " + grading())
    }

    fun grading() = when (getAverage()){
        in 90..100 -> 'A'
        in 80..90 -> 'B'
        in 70..80 -> 'C'
        in 60..70 -> 'D'
        else -> 'F'
    }

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun highest() : Int {
        var max = if (english > math) {
            println("Highest class: English ")
            english
        } else {
            println("Highest class: Math ")
            math
        }
        return max
    }
}