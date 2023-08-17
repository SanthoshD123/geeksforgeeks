//User function Template for Java
class Solution {
    public int CountPS(String S, int N) {
        int count = 0;

        // For odd-length palindromes
        for (int center = 0; center < N; center++) {
            int left = center;
            int right = center;

            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                if (right - left + 1 >= 2) { // Check for length >= 2
                    count++;
                }
                left--;
                right++;
            }
        }

        // For even-length palindromes
        for (int center = 0; center < N - 1; center++) {
            int left = center;
            int right = center + 1;

            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                if (right - left + 1 >= 2) { // Check for length >= 2
                    count++;
                }
                left--;
                right++;
            }
        }

        return count;
    }
}
