package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
    //定义数组
    int[] arr={1,2,3,4,5};
    //2.获取数组里面所有的元素
    //格式:数组名[索引]
//    System.out.println(arr[0]);
//    System.out.println(arr[1]);
//    System.out.println(arr[2]);
//    System.out.println(arr[3]);
//    System.out.println(arr[4]);
    //利用循环改进代码
//开始条件:0

//结束条件:4
//
    //在Java当中，关于数组的一个长度属性，1ength
//调用方式:数组名.length
//    System.out.println(arr.length);
    for (int i = 0; i <arr.length ; i++) {
        System.out.println(arr[i]);
    }
    //扩展:
//自动的快速生成数组的遍历方式//idea提供的
//数组名.fori
}
}
