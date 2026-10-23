package oop;

/**
 * 构造方法演示：无参构造 + 有参构造（方法重载）
 */
public class Student {
    private String name;
    private int age;

    // 无参构造方法：方法名与类名相同，没有返回值
    public Student() {
        System.out.println("看看我执行了吗？");
    }

    // 有参构造方法：与无参构造构成「构造方法的重载」
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
