package com.janson;

import com.janson.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void highestScoreTest() {
        Student student = new Student("Janson",66 , 99);
        Assertions.assertEquals(99 , student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Janson",66 , 99);
        Assertions.assertEquals((66+99)/2 , student.getAverage());
    }
}
