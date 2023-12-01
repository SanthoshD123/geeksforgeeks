class Solution {
    // Function to toggle bits in the range L to R in the binary representation of N
    static int toggleBits(int N, int L, int R) {
        // Iterate through the range L to R
        for (int i = L; i <= R; i++) {
            // Toggle the bit at position i
            N = N ^ (1 << (i - 1));
        }
        return N;
    }

    public static void main(String[] args) {
        // Example usage
        int N1 = 17, L1 = 2, R1 = 3;
        System.out.println(toggleBits(N1, L1, R1));  // Output: 23

        int N2 = 50, L2 = 2, R2 = 5;
        System.out.println(toggleBits(N2, L2, R2));  // Output: 44
    }
}
