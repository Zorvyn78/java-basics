package system;

/**
 * 学生管理系统（删除学生）
 * 演示：按 id 查找学生所在下标，找到后置为 null 完成删除
 */
public class Test3 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhanshang", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        int index = getIndex(arr, 4);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("当前id不存在，删除失败");
        }
    }

    // 按 id 查找学生下标：找到返回下标，找不到返回 -1
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}
