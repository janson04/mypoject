package com.janson.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
//        fileReader();
//        inputStream();
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fr.read();
            }
            System.out.println("\n檔案開啟並讀取成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            int n = is.read();
            while (n!=-1) {
                System.out.print(n);
                n= is.read();
            }
            System.out.println("\n檔案開啟並讀取成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
