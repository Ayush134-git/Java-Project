package Basic_Question;

public class BoundaryMatrix {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        printBoundaryElements(matrix, rows, cols);
    }


    public static void printBoundaryElements(int[][] matrix, int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid matrix dimensions.");
            return;
        }

        // Print top row
        for (int i = 0; i < cols; ++i) {
            System.out.print(matrix[0][i] + " ");
        }

        // Print right column
        for (int i = 1; i < rows; ++i) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print bottom row
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; --i) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
        }

        // Print left column
        if (cols > 1) {
            for (int i = rows - 2; i > 0; --i) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }


}



