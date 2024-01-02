package Basic_Question;

public class CompareString {

        public static void main(String[] args) {
            String str1 = "Ram";
            String str2 = "Shyam";
            String str3 = "Shyam";


            if (str1.equals(str2)) {
                System.out.println("str1 and str2 are equal.");
            } else {
                System.out.println("str1 and str2 are not equal.");
            }

            if (str1.equals(str3)) {
                System.out.println("str1 and str3 are equal.");
            } else {
                System.out.println("str1 and str3 are not equal.");
            }
            if (str2.equals(str3)) {
                System.out.println("str2 and str3 are equal.");
            } else {
                System.out.println("str2 and str3 are not equal.");
            }
        }
    }

