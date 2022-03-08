package com.janson.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.print("請輸入一個數字：");
            number = scanner.nextInt();
            if (number < secret) System.out.println("您猜的是" + number + ",請再猜大一點"); else System.out.println("您猜的是" + number + ",請再猜小一點");
            System.out.println("");
        }
        System.out.println("恭喜答對了！");
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=1;
//        }while (i<3);
//        System.out.println(i);
    }
}
