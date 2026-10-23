package oop;

public class StudentTest {
    public static void main(String[] args) {
        // 调无参构造（会打印「看看我执行了吗？」）
        // Student s = new Student();

        // 调有参构造
        Student ss = new Student("zhangsan", 23);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
