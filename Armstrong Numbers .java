class Solution {
    static String armstrongNumber(int n) {
        if (n < 100 || n > 999) {
            return "No"; // The number is not a 3-digit number.
        }

        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == originalNumber) {
            return "Yes"; // It's an Armstrong number.
        } else {
            return "No"; // It's not an Armstrong number.
        }
    }
}
