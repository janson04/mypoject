package com.janson;

public class Person extends Object{
    public Person(float weight,float height){
        super();
    }
    String name;
    float weight;
    float height;
    public float bmi(){
        float bmi = weight/ (height*height);
        return bmi;
    }
    public void hello() {
        System.out.println("Hello World");
    }
}
