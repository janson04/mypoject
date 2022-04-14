package com.janson

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2022,4,15,
        8,0,0)
    val leave = LocalDateTime.of(2022,4,15,
        10,8,0)
    var car = Car("AAA-001", enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id:String, val enter:LocalDateTime) {
    var leave:LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value))
                field = value
        }

    fun duration():Long {
        return Duration.between(enter,leave).toMinutes()
    }
}
