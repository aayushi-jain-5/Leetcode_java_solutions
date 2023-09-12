class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

         int[] result = new int[arrSize];

        int strt = 0;
        for(int i=0;i<nums.length;i+=2){
            Arrays.fill(result , strt,strt+nums[i],nums[i+1]);
            strt+=nums[i];
        }
        return result;
    }
}
