class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // Calculate the common difference
        int d = A2 - A1;

        // Calculate the nth term using the formula
        int nthTerm = A1 + (N - 1) * d;

        return nthTerm;
    }
}
