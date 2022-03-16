package com.janson.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        map();
//        set();
//        list();
//        arrayTest();
    }

    private static void map() {
        //map
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","TSMC");
        stocks.put("006208","富邦台灣采吉50基金");
        System.out.println(stocks);
        System.out.println("------");
        System.out.println(stocks.get("2330"));
        System.out.println("------");
        for (String key: stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
    }

    private static void set() {
        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for (int n:set) {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = (int)list.get(0);
        System.out.println("Size:" + list.size());

        List<Integer> scores = Arrays.asList(68, 88, 77, 99, 50);
        for (int score: scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
        int[] scores = {68, 88, 77, 99, 50};
        System.out.println(scores);
        for (int i=0 ; i<=4 ; i++){
            System.out.println(scores[i]);
        }
        System.out.println("------");
        for (int n :scores) {
            System.out.println(n);
        }
    }
}
