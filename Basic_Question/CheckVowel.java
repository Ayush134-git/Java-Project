package Basic_Question;

public class CheckVowel {

        public static void main(String[] args) {
            String inputString = "Ayush Gupta";
            int vowelCount = countVowels(inputString);

            System.out.println("Original String: " + inputString);
            System.out.println("Number of vowels: " + vowelCount);
        }

        public static int countVowels(String str) {
            int count = 0;
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            return count;
        }

}
