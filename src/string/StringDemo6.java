package string;

import java.util.Scanner;

/**
 * 统计字符串中大写字母、小写字母、数字的个数
 * 技巧：字符比较本质是比较 ASCII 码，'a'~'z'、'A'~'Z'、'0'~'9' 在编码表中各自连续
 */
public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("小写字母一共有：" + smallCount + "大写字母一共有：" + bigCount + "数字一共有：" + numberCount);
    }
}
