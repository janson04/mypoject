package com.janson;

public class Hello {
    public static void main(String[] args) {
        Person p=new Person("Janson",66.5f,1.7f);
        p.hello();
//        p.weight=66.5f;
//        p.height=1.7f;
        int age=19;
        int score=88;
        System.out.println(score>80 && score<90);
        System.out.println(score<80 || score>90);
        char c='a';
        System.out.println(c>'A');
        System.out.println(p.bmi());
    }
}
