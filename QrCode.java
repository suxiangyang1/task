package com.soft1841.Demo;

import com.soft1841.Util.QRCodeUtil;

/**
 * @author ysx
 * @date 2020 1.32
 *
 */
public class QrCode {
    public static void main(String[] args) {
        //存放在二维码中的的内容
        String text ="https://hutool.cn/";
        //嵌入二维码的路径和名字
        String imagePath = "H:/girl4.jpg";
        //生成二维码的路径和名称
        String destPath = "H:/jam.jpg";
        //生成二维码
        try {
            QRCodeUtil.encode(text,imagePath,destPath,true);
            //解析二维码
            String str = QRCodeUtil.decode(destPath);
            //打印解析出的内容
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
