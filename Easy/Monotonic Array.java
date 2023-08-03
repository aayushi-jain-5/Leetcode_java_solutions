class Solution {
    public boolean isMonotonic(int[] nums) {
        int cnt=0,cnt1=0;
        int i=0, j=1;
        while(i<=j && j<nums.length){
            if(nums[i]<nums[j]){
                cnt++;
            }
            if(nums[i]>nums[j]){
                cnt1++;
            }
            i++;
            j++;
        }
        if(cnt==0 && cnt1==0)
        return true;
        else if(cnt==0 )
        return true;
        else if(cnt1==0 )
        return true;
        else 
        return false;
    }
}
