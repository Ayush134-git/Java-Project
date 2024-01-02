package Basic_Question;

public class PrintASCIIValue {

        public static void main(String[] args) {
            char[] characters = {'A', 'a', '0', 'H', 'P', 'Q'};

            System.out.println("ASCII values of characters:");

            for (char ch : characters) {
                int asciiValue = (int) ch;
                System.out.println("Character: " + ch + ", ASCII value: " + asciiValue);
            }
        }
    }

