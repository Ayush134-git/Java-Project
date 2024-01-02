package Basic_Question;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicateArray {

    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 4};

        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        System.out.println("Original Array: " + Arrays.toString(arrayWithDuplicates));
        System.out.println("Array Without Duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return arr;
        }
        Arrays.sort(arr);

        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
    }


