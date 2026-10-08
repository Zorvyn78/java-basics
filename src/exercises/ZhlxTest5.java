package exercises;

import java.util.Scanner;

public class ZhlxTest5 {
    public static void main(String[] args) {
        //需求:综合练习——评委打分，去掉一个最高分和一个最低分后求平均分
        //规律:平均分 = (总分 - 最高分 - 最低分) / (人数 - 2)
        //易错点:if 后面不能加分号(分号会让判断失效)；整数除法会丢小数，用 double
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        double avg = (sum - max - min) / (double) (scoreArr.length - 2);
        System.out.println("平均分: " + avg);
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委打分的分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("当前的成绩超出范围,当前的i为:" + i);
            }
        }
        sc.close();
        return scores;
    }
}
