package operators;
public class ArithmeticoperatorDemo2 {
    //1.整数参与计算，结果只能得到整数
//2.小数参与计算，结果有可能是不精确的，如果我们需要精确计算，那么需要用到后面的知识点。
public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10.0/3);
//取模 取余。实际上也是做除法运算，只不过得到的是余数而已。
        System.out.println(10%2);
        System.out.println(10%3);
    }

}
