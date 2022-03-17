package com.janson.kotlin

class GraduateStudents(name: String, english: Int, math: Int,var thesis: Int)
    : Students(name, english, math){
    companion object{
        var pass = 70
    }

    override fun print() {
        print("$name\t$english\t$math\t$thesis"
                + "\nAverage: "+ getAverage() + "\t" + if (getAverage() >= pass) "PASS" else "FAILED")
        println("\nGrade: " + grading())
    }
}

open class Students(var name: String, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

    open fun print() {
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