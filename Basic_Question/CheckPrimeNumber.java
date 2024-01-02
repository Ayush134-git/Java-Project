package Basic_Question;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        int num = 8;
        int A = 0;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                A = A + 1;
            }
        }

        if (A > 0) {
            System.out.println("It is not a prime number");
        } else {
            System.out.println("it is a prime number");
        }


    }
}
