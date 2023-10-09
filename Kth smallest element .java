class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int index = partition(arr, l, r);

            if (index - l == k - 1) {
                return arr[index];
            } else if (index - l > k - 1) {
                return kthSmallest(arr, l, index - 1, k);
            } else {
                return kthSmallest(arr, index + 1, r, k - index + l - 1);
            }
        }

        return -1; // Or any suitable default value indicating an error
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
