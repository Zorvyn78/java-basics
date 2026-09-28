package method;

public class MethodTest6 {
    public static void main(String[] args) {
        //需求:定义方法 getmax，接收 int 数组，返回数组中的最大值
        //规律:max 初始值必须是数组中的值，边遍历边更新
        int[] arr = {1, 3, 4, 7, 9, 10};
        int max = getmax(arr);
        System.out.println(max);
    }

    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
