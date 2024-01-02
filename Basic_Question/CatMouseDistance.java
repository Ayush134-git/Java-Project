package Basic_Question;

import java.util.Scanner;

public class CatMouseDistance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();

        for (int i =0; i < distance; i++ ){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int dist1 =Math.abs(x-z);
            int dist2 = Math.abs(y-z);

            if (dist1 < dist2){
                System.out.println("Cat A");
            }
            else if (dist1 > dist2){
                System.out.println("Cat B");
            }
            else {
                System.out.println("Mouse C ");
            }
        }

    }
}
