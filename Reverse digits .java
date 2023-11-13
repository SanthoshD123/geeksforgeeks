class Solution {
    public long reverse_digit(long n) {
        // Convert the number to a string
        String numberString = String.valueOf(n);

        // Convert the string to a character array
        char[] charArray = numberString.toCharArray();

        // Reverse the character array
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        // Convert the character array back to a string and then to a long
        String reversedString = new String(charArray);
        long reversedNumber = Long.parseLong(reversedString);

        return reversedNumber;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        // Input: 200
        // Output: 2
        long result1 = solution.reverse_digit(200);
        System.out.println(result1);

        // Example usage:
        // Input: 122
        // Output: 221
        long result2 = solution.reverse_digit(122);
        System.out.println(result2);
    }
}
