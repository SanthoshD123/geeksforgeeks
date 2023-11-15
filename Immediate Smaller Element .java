class Solution {
    void immediateSmaller(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            // Check if the next element is smaller
            if (arr[i + 1] < arr[i]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }

        // For the last element, always update to -1
        arr[n - 1] = -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] arr1 = {4, 2, 1, 5, 3};
        int n1 = arr1.length;
        solution.immediateSmaller(arr1, n1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        // Output: 2 1 -1 3 -1
        System.out.println();

        int[] arr2 = {5, 6, 2, 3, 1, 7};
        int n2 = arr2.length;
        solution.immediateSmaller(arr2, n2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        // Output: -1 2 -1 1 -1 -1
        System.out.println();
    }
}
