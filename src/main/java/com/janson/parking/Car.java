package com.janson.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuration() {
        Duration duration = Duration.between(this.enter,this.leave);
        return duration.toMinutes();
    }
    public void leave() {
        //long值時: this.leave = System.currentTimeMillis();
        this.leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave) {
        /*
        //long值作法
        if (leave > enter) this.leave = leave;
        */
        if (leave.isAfter(enter)) this.leave = leave;
    }
}
