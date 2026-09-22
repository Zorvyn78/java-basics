package array;

public class ArrTest4 {
    public static void main(String[] args) {
        //需求:求数组中所有元素的最大值
        //分析:
        //1.max的初始值一定要是数组中的值，不能是0
        //  因为数组元素可能全部为负数，用0当初始值会出错
        //2.循环从0开始也可以，但第一次循环是自己和自己比，
        //  对结果没有影响，只是效率略低；为了提高效率，循环可以从1开始
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        //循环获取数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
