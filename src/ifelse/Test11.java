package ifelse;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int chenji = sc.nextInt();
        if (chenji >= 0 && chenji <= 100) {
            if (chenji >= 95) {
                System.out.println("赠送自行车");
            } else if (chenji >= 90) {
                System.out.println("游乐场玩一天");
            } else if (chenji >= 80) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("拖出去打一顿");
            }
        } else {
            System.out.println("当前成绩不合法");
        }
    }
}
