class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int length =1;
        int n =  nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){

                length++;
            }
            else{
                if(max<length){
                    max=length;
                }
                length=1;
            }
        }
        return Math.max(max,length);
    }
}
