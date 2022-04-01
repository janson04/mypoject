package com.janson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class McDonald {
    Map<String ,Item> menu = new HashMap<>();
    public McDonald() {
        File file = new File("mcdonalds");
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                String[] tokes = line.split(",");
                Item item = new Item(
                        tokes[0],
                        tokes[1],
                        Integer.parseInt(tokes[2]),
                        Integer.parseInt(tokes[3]));
                menu.put(item.id , item);
                line = in.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取餐點檔案失敗");
        }
    }
    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        McDonald mc = new McDonald();
        mc.printMenu();
    }
}

class Item {
    String id;
    String name;
    int calorie;
    int price;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calorie + "\t" + price;
    }

    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
