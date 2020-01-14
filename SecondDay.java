package com.soft1841.Demo;

import java.io.*;

/**
 * @author ysx
 * @date 2020.1.14
 * 文件的拷贝
 */
public class SecondDay {
    public static void main(String[] args) {
        //创建文件对象
        File fromfile = new File("E:\\from\\girl1.jpg");
        File tofile = new File("E:\\to\\copy.jpg");
        //判断文件是否存在
        if (!fromfile.exists() && !tofile.exists()){
            System.out.println("文件不存在");
        }

        //创建流
        try {
            //创建字节输入流
            InputStream in = new FileInputStream(fromfile);
            //创建字节输出流
            OutputStream out = new FileOutputStream(tofile);
            //创建缓冲字节输入流
            BufferedInputStream bi=new BufferedInputStream(in);
            //创捷缓冲字节输出流
            BufferedOutputStream bo = new BufferedOutputStream(out);
            //
            int size =0;
            while ((size=bi.read()) != -1){
                bo.write(size);
            }
            bi.close();
            bo.close();
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
