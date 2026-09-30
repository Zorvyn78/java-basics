package method;

public class MethodTest8 {
    public static void main(String[] args) {
        //需求:定义方法 copyOfRange(int[] arr, int from, int to)
        //将数组 arr 中从索引 from(包含)开始、到索引 to(不包含)结束的元素复制到新数组中，返回新数组
        //规律:双下标——i 从 from 开始读原数组，index 从 0 开始写新数组，同步前进
        //     新数组长度 = to - from(元素个数)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyArr = copyOfRange(arr, 3, 7);   // 切 [3,7) → {4,5,6,7}
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];   // 新数组长度 = 元素个数(包头不包尾)
        int index = 0;                       // 新数组写到第几个
        for (int i = from; i < to; i++) {    // 原数组从 from 读到 to-1
            newArr[index] = arr[i];          // 抄写
            index++;
        }
        return newArr;
    }
}
