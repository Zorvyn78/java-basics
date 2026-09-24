package method;

public class MethodTest2 {
    public static void main(String[] args) {
        //需求:定义一个方法，求圆的面积(π取3.14)
        getArea(1.5);
    }

    public static void getArea(double radius) {
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}
