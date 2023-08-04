/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int x=sum(root, low, high);
        return x;
     }
    int sum=0;
    public int sum(TreeNode root,int low,int high){
        if(root==null)
        return -1;

        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        sum(root.left, low, high);
        sum(root.right, low, high);

        return sum;

    }
}
