class Solution {
    public int NthRoot(int n, int m) {
        if (m < 0 && n % 2 == 0) {
            return -1;  // Non-integer result for even root of a negative number
        }

        double result = Math.pow(m, 1.0 / n);

        // Check if the result is an integer
        if (Math.pow(Math.round(result), n) == m) {
            return (int) Math.round(result);
        } else {
            return -1;
        }
    }
}
