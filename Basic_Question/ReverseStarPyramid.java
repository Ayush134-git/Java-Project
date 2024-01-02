package Basic_Question;

public class ReverseStarPyramid {

    public static void main(String[] args) {


        int l, m, n, A = 5;

        for (l = 0; l <=A-1; l++) {

            for (m = 0 ;m <= l; m++) {

                System.out.print(" ");
            }

            for (n = 0; n <=A-1-l; n++) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
