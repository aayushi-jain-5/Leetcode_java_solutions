class Solution {
    public int fib(int n) {
        int x=fibo(n);
        return x;
    }
    public int fibo(int n){
        int y;
        if(n==0)
        return 0;
        if(n==1 || n==2){
            return 1;
        }
        else{
            y=fibo(n-1)+fibo(n-2);
        }
        return y;
    }
}
