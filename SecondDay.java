package com.soft1841.Demo;

import java.io.*;

/**
 * @author ysx
 * @date 2020.1.14
 * 文件的拷贝
 */
public class SecondDay {
    public static void main(String[] args) {
        //创建图片文件对象
        File fromfile = new File("E:\\from\\girl1.jpg");
        File tofile = new File("E:\\to\\copy.jpg");
        //创建文本复制对象
        File source = new File("E:/random.txt");
        File dest = new File("E:/array.txt");
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
            int size =0;
            while ((size=bi.read()) != -1){
                bo.write(size);
            }
            //创建字符输入流
            Reader reader = new FileReader(source);
            //创建字符输出流
            Writer writer = new FileWriter(dest);
            //创建缓冲输入流
            BufferedReader br = new BufferedReader(reader);
            //创建缓冲输出流
            BufferedWriter bw = new BufferedWriter(writer);
            int len;
            while ((len=br.read()) != -1){
                bw.write(len);
            }
            bi.close();
            bo.close();
            in.close();
            out.close();
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
