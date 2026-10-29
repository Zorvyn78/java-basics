package oop;

public class GameTest {
    static void main(String[] args) {
        Role r1 = new Role("乔峰", 100);
        Role r2 = new Role("鸠摩智", 100);
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
