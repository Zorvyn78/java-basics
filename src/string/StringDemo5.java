package string;

import java.util.Scanner;

/**
 * 遍历字符串：length() 求长度 + charAt(index) 按索引取字符
 */
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        // 索引范围 0 ~ length()-1，逐个取出字符打印
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
