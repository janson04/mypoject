package com.janson.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest(){
        val student = Students("Janson",66 , 99)
        Assertions.assertEquals(99,student.highest())
    }

    @Test
    fun averageTest() {
        val student = Students("Janson",66 , 99)
        Assertions.assertEquals((66+99)/2,student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Students("Janson",66 , 99)
        Assertions.assertEquals('B' , student.grading())
    }
}