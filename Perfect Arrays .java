class Solution {

    public boolean IsPerfect(int a[], int n) {
        // Check if the array is equal to its reverse
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        // Check if the arrays are perfect
        boolean result1 = solution.IsPerfect(arr1, arr1.length);
        boolean result2 = solution.IsPerfect(arr2, arr2.length);

        // Print the results
        if (result1) {
            System.out.println("PERFECT");
        } else {
            System.out.println("NOT PERFECT");
        }

        if (result2) {
            System.out.println("PERFECT");
        } else {
            System.out.println("NOT PERFECT");
        }
    }
}
