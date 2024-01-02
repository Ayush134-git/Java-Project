package Basic_Question;

public class StraightMatrix {
    public static void main(String[] args) {
       int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(StraightSum(a));
    }
    public static int StraightSum(int [][] arr){
        int k=0;
        int l=0;

        for (int i = 0; i < arr.length; i++){
            for (int j=0; j< arr[i].length; j++) {

                if (j == 0) {
                    k = k + arr[i][j];
                }
                if (j == arr[i].length-1 ){
                    l = l+ arr[i][j];
                }
            }
        }
        System.out.println(k);
        System.out.println(l);
        return Math.abs(k-l);
    }

}
