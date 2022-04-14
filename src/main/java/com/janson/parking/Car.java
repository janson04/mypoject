package com.janson.parking;

public class Car {
    private String id;
    private long enter;
    private long leave;

    public Car(String id, long enter) {
        this.id = id;
        this.enter = enter;
    }

    public void leave() {
        this.leave = System.currentTimeMillis();
    }
}
