package com.janson.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2022,4,15,
                        8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2022,4,15,
                        10,8,0);

        //轉換成long，如果不轉換，要把class內寫成物件導向的 LocalDateTime
//        Car car = new Car("AA-0001",enter.atZone(ZoneId.systemDefault()).toEpochSecond());

        Car car = new Car("AA-0001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());

        long hour = (long) Math.ceil(car.getDuration() / 60f);
        System.out.println(hour);

        //Java8
//        javaTime();

        //Local
//        localTime();

//        javadatecalender();
    }

    private static void localTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));

        System.out.println(now.plus(Duration.ofHours(3))); //加3小時

        LocalDateTime otherday = LocalDateTime.of(2022, 11 , 13 , 8, 16, 30);
        System.out.println(otherday);
    }

    private static void javaTime() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }

    private static void javadatecalender() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2022/4/25 08:05:11";
        Date otherday = null;
        try {
            otherday = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(otherday);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,3);
        System.out.println(calendar.getTime());
    }
}
