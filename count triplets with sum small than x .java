class Solution {
    long countTriplets(long arr[], int n, int sum) {
        Arrays.sort(arr);
        long ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] < sum) {
                    ans += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
// you can use for loop (i,j,k) for online test . for efficient way use above code 
