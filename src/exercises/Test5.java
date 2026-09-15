package exercises;
import java.util.Scanner;

public class Test5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int tep = height1 > height2 ? height1 : height2;
        int max = tep > height3 ? tep : height3;
        System.out.println(max);

    }
}
