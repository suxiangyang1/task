package com.soft1841.Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @author ysx
 * 2020.1.13
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\random.txt");
        FileWriter out;
        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            number[i] = random.nextInt(100);
        }

            for (int number1 : number) {
                System.out.println(number1);
                out = new FileWriter(file);
                out.write(number1);
                out.close();
            }

    }
}
