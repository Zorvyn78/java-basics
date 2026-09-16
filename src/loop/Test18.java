package loop;
import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请录入一个数字表示范围的开始");
    int start = sc.nextInt();
    System.out.println("请录入一个数字表示范围的结束");
    int end = sc.nextInt();
    int count = 0;
    for (int i = start; i <= end; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            //ystem.out.println(i);
            count++;

        }
    }
    System.out.println(count);
}}
