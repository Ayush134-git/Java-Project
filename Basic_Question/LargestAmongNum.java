package Basic_Question;

public class LargestAmongNum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 7;

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }


    public static int findLargest(int num1, int num2, int num3) {
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        return largest;
    }


}

