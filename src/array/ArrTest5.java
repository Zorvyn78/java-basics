package array;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        //需求:生成10个1~100的随机数存入数组
        //1.求所有元素的和、平均值
        //2.统计有多少个元素比平均值小
        int[] arr = new int[10];
        Random r = new Random();

        //生成随机数存入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        //求和(累加变量要定义在循环外)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组中所有的和为：" + sum);

        //平均值(整数除法，结果直接取整)
        int avg = sum / arr.length;
        System.out.println("数组中平均数为:" + avg);

        //统计比平均值小的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("在数组中，一共有" + count + "个数据，比平均数小");
    }
}
