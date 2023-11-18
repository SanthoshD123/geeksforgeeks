
class Solution {
    int thirdLargest(int[] a, int n) {
        // Check if the array has less than 3 elements
        if (n < 3) {
            return -1;
        }

        // Convert array to ArrayList for sorting in descending order
        Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        // Return the third element
        return arr[2];
    }
}
