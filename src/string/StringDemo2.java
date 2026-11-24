package string;

/**
 * String 比较三件套：== 比地址值、equals 比内容、equalsIgnoreCase 忽略大小写比内容
 */
public class StringDemo2 {
    public static void main(String[] args) {
        // new 出来的对象在堆内存中，和字面量 s2 指向的常量池地址不同
        String s1 = new String("abc");
        String s2 = "Abc";
        System.out.println(s1 == s2);   // false：== 比较的是地址值

        // equals：比较两个字符串的内容，区分大小写
        boolean result1 = s1.equals(s2);
        System.out.println(result1);    // false："abc" 与 "Abc" 内容不同

        // equalsIgnoreCase：忽略大小写后再比较内容
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);    // true：忽略大小写后相同
    }
}
