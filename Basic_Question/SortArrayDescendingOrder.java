package Basic_Question;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class SortArrayDescendingOrder {


        public static void main(String[] args) {

            Integer[] numbers = {5, 2, 9, 1, 5, 6};

            Arrays.sort(numbers, Collections.reverseOrder());

            System.out.println("Sorted Array in Descending Order: " + Arrays.toString(numbers));
        }
    }

