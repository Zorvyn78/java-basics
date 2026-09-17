package loop;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入你的整数");
   int number = sc.nextInt();
    for (int i = 1; i <=number ; i++) {
   if(i*i==number){
       System.out.println("就是"+number+"的平方根");
       break;
   }else if(i*i>number){
       System.out.println("就是"+number+"的平方根的整数部分");
   }
    }
}
}
