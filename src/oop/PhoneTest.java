package oop;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象：类名 对象名 = new 类名();
        Phone p = new Phone();
        p.setBrand("小米");
        p.setPrice(1999);
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        p.call();
        p.PlayGame();

        // 一个类可以创建多个对象，互不干扰
        Phone p2 = new Phone();
        p2.setBrand("苹果");
        p2.setPrice(8999);
        p2.call();
        p2.PlayGame();
    }
}
