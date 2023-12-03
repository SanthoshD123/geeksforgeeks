class Solution {
    public void zigZag(int a[], int n) {
        // Code your solution here.
        boolean flag = true;

        for (int i = 0; i < n - 1; i++) {
            // If flag is true, expect a[i] < a[i+1]
            // If flag is false, expect a[i] > a[i+1]
            if (flag) {
                // If the condition is not met, swap the elements
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            } else {
                // If the condition is not met, swap the elements
                if (a[i] < a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }

            // Flip the flag for the next pair of elements
            flag = !flag;
        }
    }

    // Helper function to swap elements at indices i and j in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
