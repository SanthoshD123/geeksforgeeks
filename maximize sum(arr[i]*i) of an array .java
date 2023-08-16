class Solution{
    static final int MOD = 1000000007;
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        long count = 0;
        for(int i=0;i<n;i++){
            count = (count +(long)arr[i]*i)%MOD;
        }
        return (int)count;
        
    }   
}
