package com.soft1841.Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @author ysx
 */
public class FirstDay {
    public static void main(String[] args) throws IOException {
        //创建random对象
        Random random =new Random();
        //创建数组
        int[] array = new int[100];
        //产生100个随机数
        for (int i=0;i<100;i++){
            int number =random.nextInt(100);
            //将随机数保存到数组里
            array[i] = number;
        }

        //存储位置
        File file = new File("E:\\array.txt");
        //文件输入流
        FileWriter out = new FileWriter(file);
        //将数组中的元素写入到文件中
        for (int i=0;i<100;i++){
            out.write(array[i] + "\t");
        }
        out.close();
    }
}
