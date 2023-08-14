class Solution {
    // Function to reverse characters in a given string.
    public static String reverseWords(String s) {
        String[] words = s.split("\\."); // Split the input string into words using dot as delimiter
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append("."); // Add a dot between words
            }
        }

        return reversed.toString();
    }
}
