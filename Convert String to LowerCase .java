class Solution {
    static String toLower(String S) {
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : S.toCharArray()) {
            // Check if the character is an uppercase letter
            if (c >= 'A' && c <= 'Z') {
                // Convert the uppercase letter to lowercase by adding 32 (the ASCII difference)
                result.append((char) (c + 32));
            } else {
                // If the character is not an uppercase letter, keep it unchanged
                result.append(c);
            }
        }

        // Convert the StringBuilder to a string and return the result
        return result.toString();
    }
}
