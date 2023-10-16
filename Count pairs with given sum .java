class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // Create a hash map to store the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Initialize the count of pairs to 0
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i]; // Calculate the complement needed for the sum to be K
            
            if (freqMap.containsKey(complement)) {
                // If the complement exists in the map, increment the count by its frequency
                count += freqMap.get(complement);
            }
            
            // Update the frequency of the current element in the map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] arr1 = {1, 5, 7, 1};
        int n1 = 4;
        int k1 = 6;
        int result1 = solution.getPairsCount(arr1, n1, k1);
        System.out.println(result1); // Output: 2
        
        // Example 2
        int[] arr2 = {1, 1, 1, 1};
        int n2 = 4;
        int k2 = 2;
        int result2 = solution.getPairsCount(arr2, n2, k2);
        System.out.println(result2); // Output: 6
    }
}

