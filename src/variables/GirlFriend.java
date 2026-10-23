package variables;

/**
 * 成员变量与局部变量同名：println(age) 取局部变量（就近原则）
 */
public class GirlFriend {
    private int age;            // 成员变量，默认值 0

    public void method() {
        int age = 10;           // 局部变量，与成员变量同名
        System.out.println(age);          // 就近原则 → 打印 10
    }
}
