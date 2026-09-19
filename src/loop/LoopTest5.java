package loop;
import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
    //先获取一个随机数。
    // 范围:0~10
    Random r =new Random();
    //3.生成随机数
    //判断技巧:
    //在小括号中，书写的是生成随机数的范围
    //这个范围一定是从e开始的。
    //到这个数-1结束
     //口诀:包头不包尾，包左不包右
    int number=r.nextInt(101);
    System.out.println(number);
}}
