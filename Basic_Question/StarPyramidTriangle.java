package Basic_Question;

public class StarPyramidTriangle {
    public static void main(String[] args) {

       int i , k, j , A = 5;

        for (i = 0; i < A; i++){

            for (k =A-1; k>=i; k--){

                System.out.print(" ");
            }

            for (j = 0; j <=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
