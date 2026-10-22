package oop;

public class GirlFriendTest2 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("czx");
        gf1.setAge(17);
        gf1.setGender("女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();

        System.out.println("=====================");

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("希格雯");
        gf2.setAge(18);
        gf2.setGender("女");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.eat();
        gf2.sleep();
    }
}
