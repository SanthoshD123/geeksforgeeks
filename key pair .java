class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Set<Integer> seenNumbers = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];
            if (seenNumbers.contains(complement)) {
                return true;  // Found a pair with the required sum
            }
            seenNumbers.add(arr[i]);
        }
        
        return false;  // No such pair found
    }
}
----------------------------------------------------------------------------------------------------
  class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        int []result = new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    result[0]=i;
                    result[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
} //for easy understanding but takes time 
