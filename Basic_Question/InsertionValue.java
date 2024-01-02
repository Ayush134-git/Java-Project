package Basic_Question;

public class InsertionValue {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};

        int index = 2;
        int value = 6;

        for (int i = number.length - 1; i > index; i--){
            number[i] = number[i - 1];
        }

        number[index] = value;

        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
