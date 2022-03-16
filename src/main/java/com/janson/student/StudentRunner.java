package com.janson.student;


import com.janson.kotlin.Students;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
//        Students.Companion.test();
//        Students.setPass(60);

        Student.pass = 50;
        Student stu = new Student("Janson", 72 , 80);
        Student stu2 = new Student("Tom", 66 , 50);
        Student stu3 = new Student("Jane", 30 , 55);
        stu.print();
        System.out.println("------");
        stu2.print();
        System.out.println("------");
        stu3.print();
        System.out.println("Highest score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input student's name:");
        String name = scanner.next();
        System.out.println("English score:");
        int english = scanner.nextInt();
        System.out.println("Math score:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english , math);
        stu.print();
        System.out.println("Highest score: " + stu.highest());
    }
}
