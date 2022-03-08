package com.janson.student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Janson", 72 , 20);
        stu.print();
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
