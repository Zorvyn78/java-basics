package array;

import java.util.Random;

public class ZhlxTest9 {
    public static void main(String[] args) {
        //需求:综合练习——抽奖:5个奖品随机打乱顺序,按打乱后的顺序依次抽出
        //例子:{2, 588, 888, 1000, 10000} → 洗牌 → 随机顺序输出(每次运行结果都不同)
        int[] arr = {2, 588, 888, 1000, 10000};

        //洗牌算法:遍历每个位置,随机挑一个索引和当前位置交换
        //  遍历完一遍,数组顺序就被彻底打乱,每个奖品落到每个位置的概率相同
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);   // 0 ~ 长度-1,包头不包尾
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //遍历打印抽奖顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
