package system;

/**
 * 学生管理系统（添加学生）
 * 演示：对象数组存储学生对象、按 id 判重、数组满时扩容后再添加
 */
public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Student stu4 = new Student(4, "zhaoliu", 26);

        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前Id重复，请修改id后再进行添加");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                // 数组已满：扩容后再添加，然后打印扩容后的数组
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                // 数组还有空位：直接放进第一个空位，然后打印原数组
                arr[count] = stu4;
                printArr(arr);
            }
        }
    }

    // 打印数组中所有非空学生
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    // 扩容：创建一个长度 +1 的新数组，把原数组元素复制过去
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // 统计数组中已有学生的个数
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    // 判断数组中是否已存在指定 id 的学生
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            // 空位直接跳过，否则 stu.getId() 会抛 NullPointerException
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
