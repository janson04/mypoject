package day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayOdYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        int months[] = {31, 28, 31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31};
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("請輸入年份:(" + year + ")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
//            if (yearString.length() > 0) {
//                year = Integer.parseInt(yearString);
//            }
            System.out.println(year);

            System.out.print("請輸入月份:(" + month + ")");
            String monthString = reader.readLine();
            if (monthString.length() > 0) {
                month = Integer.parseInt(monthString);
            }
            System.out.println(month);

            System.out.print("請輸入幾號:(" + day + ")");
            String dayString = reader.readLine();
            if (dayString.length() > 0) {
                day = Integer.parseInt(dayString);
            }
            System.out.println(day);

            int days = 0;
            for (int i=0; i < month-1 ;i++) {
                days += months[i];
            }
            days += day;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
                if (month>2) days++;
            }

            System.out.println("(函數抓的)" + now.get(Calendar.YEAR) + "年的第" + now.get(Calendar.DAY_OF_YEAR) + "天");
            System.out.println("(自己設計)" + year  + "年的第" + days + "天");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
