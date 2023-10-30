class Solution {
    static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}
