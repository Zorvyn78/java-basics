package method;

public class MethodTest4 {
    public static void main(String[] args) {
        //需求:方法重载——定义 compare 的 byte/short/int/long 四个版本，比较两个数是否相等
        //分析:同名方法靠参数类型区分，调用时自动匹配最合适的版本
        byte b1 = 10;
        byte b2 = 20;
        compare(b1, b2);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }

    public static void compare(short s1, short s2) {
        System.out.println("short");
        System.out.println(s1 == s2);
    }

    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }

    public static void compare(long n1, long n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
