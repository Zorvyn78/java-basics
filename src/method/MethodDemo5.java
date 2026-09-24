package method;

public class MethodDemo5 {
    public static void main(String[] args) {
        //需求:定义一个带返回值的方法，求三个小数的和
        //方法的三种调用方式:
        //1.直接调用:  getSum(10,20,30);
        //2.赋值调用:  double sum = getSum(10,20,30);
        //3.输出调用:  System.out.println(getSum(10,20,30));
        double sum1 = getSum(10, 20, 30);
        double sum2 = getSum(10, 20, 30);
        double sum3 = getSum(10, 20, 30);
        double sum4 = getSum(10, 20, 30);
        double sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }

    public static double getSum(double num1, double num2, double num3) {
        double result = num1 + num2 + num3;
        return result;
    }
}
