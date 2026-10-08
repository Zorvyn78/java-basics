package exercises;

import java.util.Random;

public class ZhlxTest3 {
    public static void main(String[] args) {
        //需求:综合练习——生成 7 位随机验证码(6 个字母 + 1 个数字)
        //规律:52 个字符数组(小写 a-z + 大写 A-Z)，随机取 6 个拼起来，再拼 1 个随机数字
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);     // 小写 a~z
            } else {
                chs[i] = (char) (65 + i - 26); // 大写 A~Z
            }
        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i <= 5; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}
