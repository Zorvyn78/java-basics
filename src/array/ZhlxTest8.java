package array;

public class ZhlxTest8 {
    public static void main(String[] args) {
        //需求:综合练习——数字解密(是 ZhlxTest6 数字加密的逆运算,两题正好互逆)
        //加密:{1,9,8,3} → 每位+5 → {6,14,13,8} → %10 → {6,4,3,8} → 反转 → {8,3,4,6} → 8346
        //解密:8346 → 拆位{8,3,4,6} → 反转还原 → {6,4,3,8} → 补回被 %10 截掉的10 → {6,14,13,8} → 每位-5 → {1,9,8,3} → 1983
        int[] arr = {8, 3, 4, 6};

        //1.反转数组(双指针 i++/j-- 对称交换),先把加密时的反转还原
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //2.关键一步:加密时 %10 会把 >=10 的结果截掉 10
        //  所以 <=4 的数说明当时截掉过 10,这里先补回来,才能还原原始数据
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        //3.每位 -5,还原成加密前的原始数字
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        //4.拼接成数字:number = number * 10 + arr[i]
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
