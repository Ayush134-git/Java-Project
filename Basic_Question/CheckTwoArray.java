package Basic_Question;

import java.util.Arrays;

public class CheckTwoArray {
    public static void main(String[] args) {

        int a[] = {30, 25, 40};
        int b[] = {38, 25, 40};

        boolean result = Arrays.equals(a, b);

        if (result == true) {

            System.out.println("Two arrays are equal");
        } else {

            System.out.println("Two arrays are not equal");
        }
    }
}
