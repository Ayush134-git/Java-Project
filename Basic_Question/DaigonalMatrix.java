package Basic_Question;

import java.util.List;

public class DaigonalMatrix {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};

        System.out.println(diagonalDifference(a));
    }

    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int k = 0;
        int l = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i == j) {

                    k = k + arr[i][j];
                    l = l + arr[i][(arr.length - 1) - j];
                }
            }
        }
        System.out.println("K Value: " + k);
        System.out.println("L Value: " + l);
        return Math.abs(k - l);
    }

}

