package scanner;

import java.util.Scanner;

/**
 * Scanner 录入小数：nextDouble() 接收一个小数并输出
 * （ScannerDemo1 演示的是 nextInt 录入整数，本文件是它的补充）
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double result = sc.nextDouble();
        System.out.println(result);
    }
}
