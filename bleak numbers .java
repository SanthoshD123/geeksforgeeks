class Solution
{
    public int is_bleak(int n)
    {
        // Code here
        for(int x=0;x<n;x++){
            if(x + countSetbit(x)==n){
                return 0;
            }
        }
        return 1;
    }
    int countSetbit(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}
