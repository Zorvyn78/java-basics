package method;

public class MethodTest7 {
    public static void main(String[] args) {
        //需求:定义方法 contains，判断数组中是否存在指定元素，返回 boolean
        //规律:找到立刻返回 true，全部找完没找到返回 false
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};
        boolean flag = contains(arr, 89);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
