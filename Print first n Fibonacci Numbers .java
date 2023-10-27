class Solution
{
    // Function to return list containing first n Fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        if (n <= 0) {
            return new long[0];
        } else if (n == 1) {
            return new long[]{1};
        } else if (n == 2) {
            return new long[]{1, 1};
        }

        long[] fibNumbers = new long[n];
        fibNumbers[0] = 1;
        fibNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }

        return fibNumbers;
    }
}
