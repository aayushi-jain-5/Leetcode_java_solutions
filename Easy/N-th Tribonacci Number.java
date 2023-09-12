class Solution {
    public int tribonacci(int n) {
        int t0=0;
        int t1=1;
        int t2=1;
        int t=0;
        int x= n-2;
        if(n==1 || n==2)return 1;
        while(x-- >0){
            t=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t;
        }
        return t;
    }
}
