package string;

/**
 * String 对象的多种创建方式
 * 1. 字面量直接赋值："abc"（存于字符串常量池）
 * 2. 空参构造：new String() → 空字符串
 * 3. 带参构造：new String("abc")
 * 4. 字符数组构造：new String(char[]) → 把字符依次拼成字符串
 * 5. 字节数组构造：new String(byte[]) → 按 ASCII 码转成字符
 */
public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 字面量直接赋值
        String s1 = "abc";
        System.out.println(s1);

        // 2. 空参构造：得到空字符串，用 @ 和 ! 包起来才能看出边界
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        // 3. 带参构造：传入字符串
        String s3 = new String("abc");
        System.out.println(s3);

        // 4. 字符数组构造
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        // 5. 字节数组构造：97/98/99/100 对应 a/b/c/d
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
