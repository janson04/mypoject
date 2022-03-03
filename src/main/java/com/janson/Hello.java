package com.janson;

public class Hello {
    public static void main(String[] args) {
//        String ss = null;
        String s = "efaxz";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,3));
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
