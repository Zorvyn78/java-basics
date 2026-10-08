package array;

public class ZhlxTest4 {
    public static void main(String[] args) {
        //需求:综合练习——把数组 arr 的内容复制到新数组 newArr
        //规律:新数组长度和原数组相同，遍历原数组逐个赋值
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
