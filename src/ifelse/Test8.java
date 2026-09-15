package ifelse;
import java.util.Scanner;

public class Test8 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你身上的钱");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("去吃网红餐厅");
        } else {
            System.out.println("去吃沙县小吃");
        }
    }
}
