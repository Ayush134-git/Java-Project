package Basic_Question;

public class HexagonalDaigonal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int row = matrix.length;
        int posi = 0;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix.length; j++) {
                posi++;
                if (posi % 2 == 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
