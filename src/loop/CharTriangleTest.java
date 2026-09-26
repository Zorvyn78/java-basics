package loop;

import java.util.Scanner;

public class CharTriangleTest {
    public static void main(String[] args) {
        //需求:B2005 字符三角形——给定一个字符，构造底边长5个字符、高3个字符的等腰字符三角形
        //规律:共3行，第i行(i从1开始) = (3-i)个空格 + (2i-1)个字符
        //     第1行:2空格+1字符   第2行:1空格+3字符   第3行:0空格+5字符
        //分析:
        //1.Scanner录入字符串后取第一个字符 charAt(0)
        //2.外层循环控制行数，i从1到3
        //3.每一行先打印空格(3-i个)，再打印字符(2i-1个)，同一行用print不换行
        //4.一行结束用println换行

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); //读入字符(题目保证输入一行一个字符)

        int h = 3; //三角形高度
        for (int i = 1; i <= h; i++) {
            //打印这一行的空格:h-i个
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            //打印这一行的字符:2i-1个
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
            }
            //这一行结束，换行
            System.out.println();
        }
        sc.close();
    }
}
