class Solution {
    int isDigitSumPalindrome(int N) {
        // Function to calculate the digit sum of a number
        int digitSum = calculateDigitSum(N);

        // Check if the digit sum is a palindrome
        if (isPalindrome(digitSum)) {
            return 1;
        } else {
            return 0;
        }
    }

    // Function to calculate the digit sum of a number
    int calculateDigitSum(int num) {
        int total = 0;
        while (num > 0) {
            total += num % 10;
            num /= 10;
        }
        return total;
    }

    // Function to check if a number is palindrome
    boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
