package com.soft1841.Demo;

import java.io.*;

/**
 * @author ysx
 * 2020.1.13
 */
public class Demo {
    public static void main(String[] args) throws IOException {
       File source = new File("E:/random.txt");
       File dest = new File("E:/array.txt");
       while (!dest.exists()){
           System.out.println("不存在此文件");
       }
       Reader reader = new FileReader(source);
       Writer writer = new FileWriter(dest);
       BufferedReader br = new BufferedReader(reader);
       BufferedWriter bw = new BufferedWriter(writer);
       int len;
       while ((len=br.read()) != -1){
           bw.write(len);
       }
       br.close();
       bw.close();
    }
}
