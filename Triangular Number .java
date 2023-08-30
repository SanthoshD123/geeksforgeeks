class Solution {
    int isTriangular(int N){
        //code here
        int sum = 0;
        int i = 1;
        while(sum<N){
            sum += i;
            i++;
        }
        return (sum == N)?1:0;
    }
}
