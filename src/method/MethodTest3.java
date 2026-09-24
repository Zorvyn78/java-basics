package method;

public class MethodTest3 {
    public static void main(String[] args) {
        //需求:比较两个长方形的面积谁更大
        //思路:把求面积的方法抽取出来，重复调用
        //在以后实际开发当中，我们一般把重复的代码或具有独立功能的代码抽取到方法当中
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);
        if (area1 > area2) {
            System.out.println("第一个长方形更大");
        } else {
            System.out.println("第二个长方形更大");
        }
    }

    //定义一个方法求长方形的面积
    public static double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
}
