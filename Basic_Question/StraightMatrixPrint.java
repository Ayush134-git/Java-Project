package Basic_Question;

public class StraightMatrixPrint {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        printStraightMatrix(rows, cols);
    }

    public static void printStraightMatrix(int rows, int cols) {
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= cols; ++j) {
                System.out.printf("%2d ", (i - 1) * cols + j);
            }
            System.out.println();
        }
    }


}


