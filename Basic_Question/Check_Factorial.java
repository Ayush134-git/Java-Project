package Basic_Question;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Check_Factorial {
    public static void main(String[] args) {
        int i, num, fact = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}

