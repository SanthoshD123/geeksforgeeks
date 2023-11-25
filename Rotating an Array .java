class Solution {
    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void leftRotate(int[] arr, int n, int d) {
        d = d % n; // To handle cases where d > n

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        solution.leftRotate(arr1, 7, 2);
        // Output: [3, 4, 5, 6, 7, 1, 2]
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 3, 4, 2};
        solution.leftRotate(arr2, 4, 3);
        // Output: [2, 1, 3, 4]
        System.out.println(Arrays.toString(arr2));
    }
}
