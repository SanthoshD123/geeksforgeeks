class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n)
    {
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the element to the left is greater, move left
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }

            // If the element to the right is greater, move right
            else {
                left = mid + 1;
            }
        }

        // This should not happen if the input is valid
        return -1;
    }
}
