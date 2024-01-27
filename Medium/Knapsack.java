// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static int solve(int[] weight ,int[] profit,int n , int c){
        if(n==0){
            if(weight[0]<=c)
            return profit[0];
            return 0;
        }
        
        int inc =0;
        if(weight[n]<=c){
            inc = profit[n]+ solve(weight,profit,n-1,c-weight[n]);
        }
        int exc = 0+solve(weight,profit,n-1,c);
        
        int ans = Math.max(exc,inc);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] weight=new int[n];
        int[] profit = new int[n];
        for(int i=0;i<n;i++){
            weight[i]= sc.nextInt();
            profit[i]= sc.nextInt();
        }
        int c = sc.nextInt();
        int res=solve(weight,profit,n-1,c);
        System.out.println(res);
}
}
