package array;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        //需求:随机打乱数组的顺序(洗牌)
        //思路:
        //1.从第0个元素开始，为每个元素随机生成一个索引randomIndex
        //2.交换arr[i]和arr[randomIndex]，遍历完整个数组即完成乱序
        //注意:randomIndex的范围是0~arr.length-1(包头不包尾)
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
