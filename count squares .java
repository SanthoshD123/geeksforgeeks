class Solution {
    static int countSquares(int N) {
        // code here
        int sqrtN = (int) Math.sqrt(N);
        if (sqrtN * sqrtN == N) {
            return sqrtN - 1;
        } else {
            return sqrtN;
        }
    }
}
