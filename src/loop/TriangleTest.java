package loop;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        //需求:键盘录入一个整数h，打印h行的等腰三角形
        //规律:第i行(i从1开始) = (h-i)个空格 + (2i-1)个星号
        //分析:
        //1.外层循环控制行数，i从1到h
        //2.每一行先打印空格，再打印星号(注意:同一行内容用print，不换行)
        //3.一行结束用println换行
        //易错点:用println打空格/星号会导致每个字符独占一行，拼不成图形

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            //打印这一行的空格:h-i个
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            //打印这一行的星号:2i-1个
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            //这一行结束，换行
            System.out.println();
        }
        sc.close();
    }
}
