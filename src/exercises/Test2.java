package exercises;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度");
       int me= sc.nextInt();
       System.out.println("请输入相亲对象衣服的时髦度");
       int you=sc.nextInt();
        //2.把我衣服的时髦度跟女孩的时髦度进行对比就可以了
        boolean result = me > you;
        System.out.println(result);
    }
}
