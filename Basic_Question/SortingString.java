package Basic_Question;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String inputString = "programming";

        String sortedString = sortString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String inputString) {

        char[] charArray = inputString.toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);
    }


}

