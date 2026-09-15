package exercises;
import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一只老虎体重");
        int i =sc.nextInt();
        System.out.println("请输入第二只老虎体重");
        int k =sc.nextInt();
        String max = i==k ? "相同":"不同";
        System.out.println(max);

    }
}
