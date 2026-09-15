package ifelse;
import java.util.Scanner;

public class Test10 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的的票号");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("你坐左边");
            } else {
                System.out.println("你坐右边");
            }
        }
    }
}
