package exercises;
import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
        //分析:
//1.键盘录入两个整数
// 变量a  变量b
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i= sc.nextInt();
        System.out.println("请输入二个整数");
        int k =sc.nextInt();
         boolean  result=  i==6|| k==6 || (i+k) % 6 == 0;
         System.out.println(result);


    }
}
