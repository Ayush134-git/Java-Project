package Basic_Question;

public class SwappingCharacter {
    public static void main(String[] args) {
        // Example usage
        String originalString = "abcdef";
        String swappedString = swapPairs(originalString);
        System.out.println(swappedString);
    }

    public static String swapPairs(String inputString) {

        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }

        return new String(charArray);
    }


}


