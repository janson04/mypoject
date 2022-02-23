package com.janson;

public class Hello {
    public static void main(String[] args) {
        Person p=new Person(66.5f,1.7f);
        p.hello();
        p.weight=66.5f;
        p.height=1.7f;
        System.out.println(p.bmi());
//        p.name
//        byte a = 127;
//        byte a = 127;
//        char c='C';

    }
}
