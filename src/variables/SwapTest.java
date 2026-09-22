package variables;

public class SwapTest {
    public static void main(String[] args) {
        //需求:交换两个变量的值 a=10 b=20 -> a=20 b=10
        //思路:借助第三个变量(空杯子)
        //A杯子:可乐 B杯子:雪碧 C杯子:空杯子
        //先把A倒进C，再把B倒进A，最后把C倒进B
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
