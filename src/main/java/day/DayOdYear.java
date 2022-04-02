package day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DayOdYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("請輸入年份:");
            String yearString = reader.readLine();
            int year = Integer.parseInt(yearString);
            System.out.println(year);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
