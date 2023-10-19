class Compute {
    public void rotate(int arr[], int n) {
        if (n <= 1) {
            // If the array has 0 or 1 element, no need to rotate.
            return;
        }

        // Store the last element in a temporary variable
        int temp = arr[n - 1];

        // Shift all elements to the right by one position
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element in the first position
        arr[0] = temp;
    }
}
