import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, long target) {
        List<List<Integer>> ans= new ArrayList<>();
        int cnt =0;
        Arrays.sort(nums);
        rec(0,nums,target,ans,new ArrayList<>(),cnt);
        return ans;
    }
    private void rec(int ind , int[] arr,long target,List<List<Integer>> ans,List<Integer> ds,int cnt){
        if (cnt == 4) { // We have selected 4 elements.
            if (target == 0) { // Check if they sum up to the target.
                
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (ind == arr.length) {
            return;
        }
            for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue; // Skip duplicate elements to avoid duplicate combinations.
            }

            ds.add(arr[i]);
            rec(i + 1, arr, target - arr[i], ans, ds, cnt + 1);
            ds.remove(ds.size() - 1);
        }
    }
}
