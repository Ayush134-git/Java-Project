package Basic_Question;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5; // Change this to the desired number of rows
        printPascalTriangle(numRows);
    }

    private static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int space = 0; space < numRows - i; space++) {
                System.out.print("  ");
            }

            int coefficient = 1;
            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", coefficient);

                coefficient = coefficient * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


