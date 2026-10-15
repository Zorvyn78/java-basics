package array;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };
        System.out.println(arr2[0][0]);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
