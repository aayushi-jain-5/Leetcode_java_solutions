class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                len=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]*2>max && i!=len){
                return -1;
            }
        }
        return len;
    }
}
