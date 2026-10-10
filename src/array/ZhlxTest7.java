package array;

public class ZhlxTest7 {
    public static void main(String[] args) {
        //需求:综合练习——数字拆位:把一个整数的每一位拆出来,正序存入数组
        //例子:12345 → 位数5 → 数组{1,2,3,4,5}
        int number = 12345;

        //1.先算位数:反复 /10 直到 0,除了几次就是几位数
        //  坑点:循环结束后 number 已经被改成 0,所以必须提前用 temp 备份原值
        int count = 0;
        int temp = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        //2.根据位数创建数组,起始下标取 arr.length-1(从最后一位往前填)
        //  注意:必须先创建数组,才能使用 arr.length
        int[] arr = new int[count];
        int index = arr.length - 1;

        //3.%10 取出个位,再 /10 去掉这一位
        //  从后往前填 → 拆出来的数字正好是正序存放
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }

        //4.遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
