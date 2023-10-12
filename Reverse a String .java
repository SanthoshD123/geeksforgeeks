class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Reverse the char array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String reversed = reverseWord("Hello");
        System.out.println(reversed); // Output: olleH
    }
}
