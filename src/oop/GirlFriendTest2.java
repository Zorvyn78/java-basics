package oop;

public class GirlFriendTest2 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "czx";
        gf1.age = 17;
        gf1.gender = "萌妹纸";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);
        gf1.eat();
        gf1.sleep();

        System.out.println("=====================");

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "希格雯";
        gf2.age = 18;
        gf2.gender = "萌妹纸";
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        gf2.eat();
        gf2.sleep();
    }
}
