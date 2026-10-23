package variables;

/**
 * 成员变量与局部变量同名：println(this.age) 取成员变量
 */
public class GirlFriend1 {
    private int age;            // 成员变量，默认值 0

    public void method() {
        int age = 10;           // 局部变量，与成员变量同名
        System.out.println(this.age);     // 加 this → 打印成员变量 0
    }
}
