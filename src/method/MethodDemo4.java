package method;

public class MethodDemo4 {
    public static void main(String[] args) {
        //需求:定义一个带参数的方法，求两个整数的和
        getSum(20, 10);
    }

    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
