package array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //需求:定义一个数组，用来存班级中50个学生的姓名
        //姓名未知，等学生报道之后再进行添加
        //格式:数据类型[] 数组名 = new 数据类型[数组的长度];
        //创建时由我们指定长度，虚拟机给出默认的初始化值

        String[] arr = new String[50];
        //添加学生
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); //没添加过的位置，默认值是null

        //数组默认初始化值的规律:
        //整数类型:0
        //小数类型:0.0
        //字符类型:'\u0000'(空格)
        //布尔类型:false
        //引用数据类型:null

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
