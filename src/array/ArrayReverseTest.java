package array;

public class ArrayReverseTest {
    public static void main(String[] args) {
        //需求:反转数组 {1,2,3,4,5} -> {5,4,3,2,1}
        //分析:
        //1.双指针:i指向开头，j指向结尾
        //2.交换arr[i]和arr[j]，然后i++、j--，直到i>=j
        //易错点:循环更新部分必须同时写i++和j--，漏写i++会导致i永远停在0，
        //       每一步都在用arr[0]反复和不同位置的尾巴交换，结果不是反转

        int[] arr = {1, 2, 3, 4, 5};

        //双指针交换
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
