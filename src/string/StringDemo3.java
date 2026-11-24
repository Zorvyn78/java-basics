package string;

import java.util.Scanner;

/**
 * 键盘录入字符串用 == 比较的陷阱
 * Scanner 录入得到的字符串是新建对象，与字面量地址不同，即使用户输入 abc，
 * str1 == str2 仍返回 false。结论：比较字符串内容一律用 equals。
 */
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        String str2 = "abc";
        // 输入 abc 也打印 false：== 比的是地址，不是内容
        System.out.println(str1 == str2);
    }
}
