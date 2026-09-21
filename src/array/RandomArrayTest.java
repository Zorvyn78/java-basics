package array;

import java.util.Random;

public class RandomArrayTest {
    public static void main(String[] args) {
        //需求:生成10个1~100的随机数存入数组，并逐个打印
        //分析:
        //1.循环1:往数组里存随机数(写)
        //2.循环2:把数组内容打印出来(读)
        //3.为什么用两个循环:数组要先填满再使用，求平均值/排序/找最大值
        //  都要等数组填好，所以"写"和"读"分成两个阶段

        int[] arr = new int[10];
        Random r = new Random();

        //循环1:写(生成随机数存进数组)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1; //1~100
        }

        //循环2:读(打印数组内容)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
