package com.janson.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i=5 ; i>=1 ; i--){
//            sum += i;
//        }
//        System.out.println(sum);
//        for (int i=1 ; i<=3 ; i++){
//            System.out.println(i);
//        }
        Random random = new Random();
        int secert = random.nextInt(10)+1;
        System.out.println(secert);
        Scanner scanner = new Scanner(System.in);
        for (int i=1 ; i<=5 ; i++) {
            System.out.print("請輸入一個數字(" + i + "/5)：");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次輸入，數字：" + number);
            if (i == 5) {
                System.out.println("真糟糕已經猜了" + i + "次卻還沒有猜中");
                break;
            }
            if (number < secert) {
                System.out.println("請再猜大一點");
            } else if (number > secert) {
                System.out.println("請再猜小一點");
            } else {
                System.out.println("恭喜猜對了，數字是" + secert);
                break;
            }
            if (number == -1) {
                System.out.println("強制結束");
                break;
            }
        }
        System.out.println("結束");
    }
}