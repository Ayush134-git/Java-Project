package Basic_Question;

public class CheckArmstrong {
    public static void main(String[] args) {
        int num = 1537;
        int t1 = num;
        int leng = 0;

        while (t1 != 0) {
            leng = leng + 1;
            t1 = t1 / 10;


        }
        int t2 = num;
        int rem;
        int arm = 0;

        while (t2 != 0) {
            rem = t2 % 10;
            int mult = 1;
            for (int i = 1; i <= leng; i++) {
                mult = mult * rem;
            }
            arm = arm + mult;
            t2 = t2 / 10;
        }
        if (num == arm) {
            System.out.println("this number is armstrong");
        } else {
            System.out.println("this number is not armstrong");
        }
    }
}
