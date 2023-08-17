class Solution {
    public int gcd(int N, int arr[]) {
        int ans = 1;
        int x = arr[0];
        for (int i = 1; i < N; i++) {
            x = Math.min(x, arr[i]);
        }
        for (int i = 1; i <= x; i++) {
            boolean isDivisor = true; // Declare and initialize isDivisor inside the loop
            for (int j = 0; j < N; j++) {
                if (arr[j] % i != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                ans = i;
            }
        }
        return ans;
    }
}
