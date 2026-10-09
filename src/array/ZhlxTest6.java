package array;

public class ZhlxTest6 {
    public static void main(String[] args) {
        //需求:综合练习——数字加密:每个数+5 → %10取个位 → 反转 → 拼接成新数字
        //例子:{1,9,8,3} → +5得{6,14,13,8} → %10得{6,4,3,8} → 反转得{8,3,4,6} → 8346
        int[] arr = {1, 9, 8, 3};

        //1.每位 +5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //2.每位 %10 取个位
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //3.反转数组(双指针 i++/j--)
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //4.拼接成数字:number = number * 10 + arr[i]
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
