package loop;
import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
    //需求:键盘录入一个正整数x，判断该整数是否为一个质数
    //质数:
    //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
    //7=1*7质数
    //8=1*8 2*4合数
    //分析:
    //1.键盘录入一个正整数
    //number
    Scanner sc =new Scanner(System.in);
    System.out.println("请输入一个正整数");
    int number= sc.nextInt();
    boolean flag=true;
    //2.判断
    //写一个循环，从2开始判断，一直判断到number-1为止
    //看这个范围之内，有没有数字可以被number整除
    for (int i = 2; i < number; i++) {

        //i依次表示这个范围之内的每一个数字
        //看number是否能被i整除就可以了
        if (number % i == 0) {
            flag = false;
            //System.out.println(number+"不是一个质数");
            break;

        }
    }
        if (flag){
            System.out.println(number+"是一个质数");
        }else{
            System.out.println(number+"不是一个质数");
        }

    }

}
