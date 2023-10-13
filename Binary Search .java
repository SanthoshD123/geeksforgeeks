class Solution {
    int binarysearch(int arr[], int n, int k) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return mid; // K is found at index mid
            } else if (arr[mid] < k) {
                left = mid + 1; // K must be on the right half
            } else {
                right = mid - 1; // K must be on the left half
            }
        }

        return -1; // K is not present in the array
    }
}
