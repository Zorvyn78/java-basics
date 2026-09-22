package array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //需求:演示索引越界异常
        //小结:
        //索引越界异常的原因:访问了不存在的索引
        //避免:索引的范围是0~数组长度-1
        //最小索引:0
        //最大索引:4(数组的长度-1)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);
        //System.out.println(arr[10]);
        //上面这行一运行就会报 ArrayIndexOutOfBoundsException(索引越界异常)
    }
}
