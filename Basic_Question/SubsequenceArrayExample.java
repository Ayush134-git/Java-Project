package Basic_Question;

import java.util.Arrays;

public class SubsequenceArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5};
        int start = 0;
        int end = 4;

        int[] subArr = new int[end - start];
        for (int i = start; i < end; i++) {
            subArr[i - start] = arr[i];
        }

        System.out.println(Arrays.toString(subArr));
    }
}
