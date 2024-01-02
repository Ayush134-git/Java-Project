package Basic_Question;

import javax.swing.*;

public class StarDaimond {
    public static void main(String[] args) {

        int i , k, j ,l,m,n, A = 5;

        for (i = 0; i < A; i++){

            for (k =A-1; k>=i; k--){

                System.out.print(" ");
            }

            for (j = 0; j <=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }

        for(l=2; l<=A; l++){
            for (m=1;m<l;m++){
                System.out.print(" ");

            }
            for (n=l;n<=A;n++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
