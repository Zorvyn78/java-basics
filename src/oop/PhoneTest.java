package oop;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象：类名 对象名 = new 类名();
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.98;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.PlayGame();

        // 一个类可以创建多个对象，互不干扰
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;
        p2.call();
        p2.PlayGame();
    }
}
