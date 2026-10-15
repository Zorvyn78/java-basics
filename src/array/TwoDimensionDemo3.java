package array;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yeaarSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterArr = yearArrArr[i];
            int sum = getsum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的总营业为:" + sum);
            yeaarSum = yeaarSum + sum;
            System.out.println("全年的总营业额为：" + yeaarSum);
        }
    }

    public static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
