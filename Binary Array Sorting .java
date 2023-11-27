class Solution
{
    // Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // Count the number of 0s
        int countZeros = 0;
        for (int num : A) {
            if (num == 0) {
                countZeros++;
            }
        }

        // Update the array with 0s followed by 1s
        for (int i = 0; i < countZeros; i++) {
            A[i] = 0;
        }
        for (int i = countZeros; i < N; i++) {
            A[i] = 1;
        }
    }
}
