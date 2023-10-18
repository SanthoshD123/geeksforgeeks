class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int N) {
        // Your code here
        // Check if both arrays have the same length
        if (A.length != B.length) {
            return false;
        }
        
        // Sort the arrays (if you want to compare sorted arrays)
        Arrays.sort(A);
        Arrays.sort(B);
        
        // Compare the sorted arrays element by element
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        
        return true;
    }
}
