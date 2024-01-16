lass Solution{
    public:
    // Function to find equilibrium point in the array.
    // a: input array
    // n: size of array
    int equilibriumPoint(long long a[], int n) {
    
        // Your code here
        long long presum[n];
        long long sufsum[n];
        presum[0]=a[0];
        for(int i=1;i<n;i++){
            presum[i] = presum[i-1]+a[i];
        }
        sufsum[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            sufsum[i]=sufsum[i+1]+a[i];
        }
        for(int i=0;i<n;i++){
            if(presum[i]==sufsum[i]){
                return i+1;
            }
        }
        return -1;
    }

};
