package Basic_Question;

import java.util.Random;
import java.util.Arrays;

public class ArrayRandomNumber {

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generateRandomArray(size);

        System.out.println("Random Array: " + Arrays.toString(randomNumbers));
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
