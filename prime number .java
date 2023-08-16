class Solution{
    static int isPrime(int N){
        // code here
        if (N <= 1) {
            return 0;  // 1 is not prime
        }
        if(N<=3){
            return 1;
        }
        if(N%2==0||N%3==0){
            return 0;
        }
        for(int i=5;i*i<=N;i+=6){
            if(N%i==0||N%(i+2)==0){
                return 0;
            }
        }
        return 1;
    }
}
