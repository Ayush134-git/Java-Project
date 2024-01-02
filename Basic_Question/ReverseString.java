package Basic_Question;

public class ReverseString {
    public static void main(String[] args) {

        String str= "Marunji";
        String reversedStored = "";

        for (int i = str.length()-1; i>=0; i--){

            reversedStored = reversedStored + str.charAt(i);

        }
        System.out.println("original string : " + str);

        System.out.println("Reverse of given String : " + reversedStored);
    }
}
