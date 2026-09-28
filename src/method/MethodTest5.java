package method;

public class MethodTest5 {
    public static void main(String[] args) {
        //需求:定义方法 printArr，接收 int 数组并打印成 [11,22,33] 格式
        //规律:最后一个元素不加逗号，其余元素后面加逗号
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
