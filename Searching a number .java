public class Solution {
    public int search(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i + 1; // Position is 1-based, so add 1 to the index.
            }
        }
        return -1; // k was not found in the array.
    }
}
