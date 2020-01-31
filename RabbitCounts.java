package com.soft1841.Demo;
/**
 * @Description  计算一年中兔子每个月的兔子总数
 * @author ysx
 * @date
 */
public class RabbitCounts {
    public static void main(String[] args) {
        //定义月数
        int month = 12;
        //定义月的兔子总数
        int f1=1,f2=1,f;
        System.out.println("第一月的兔子总数为1对");
        System.out.println("第二月的兔子总数1对");
        for (int i=3;i<month;i++){
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println("第"+month+"个月的兔子总数为"+ f2+"对");
        }
    }
}
