class Solution {
    public int arrangeCoins(int n) {
        int x = n;
        int cnt =0;
        for(int i=1;i<=x;i++){
            if(n>=i){
                n-=i;
                cnt++;
            }
            else break;
        }
        return cnt;
    }
}
