package system;

/**
 * 学生管理系统：学生实体类
 * 属性：id（学号）、name（姓名）、age（年龄）
 * 提供无参构造 + 有参构造（构造方法重载）以及 getter/setter
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
