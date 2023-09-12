class Solution {
    public int findSpecialInteger(int[] arr) {
        double n= 0.25* arr.length;
        double x= Math.ceil(n);
        int cnt=1,res=0,ele=0;
        if(arr.length ==1){
            return arr[0];
        }
        for(int i=0;i<arr.length - arr.length/4;i++){
            if(arr[i]==arr[i+arr.length/4]){
                // cnt++;
                // if(cnt>=x){
                    // res=cnt;
                    ele=arr[i];
                // }
            }
            else
            cnt=0;
        }
        return ele;


    }
}
