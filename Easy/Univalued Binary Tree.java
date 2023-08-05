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
    boolean ans = true;
    public boolean isUnivalTree(TreeNode root) {
        int x = root.val;
        return value(root, x);
    }
    boolean value(TreeNode root, int x) {
        if (root==null) return ans;
        if (ans==false) return ans;
        if (root.left!=null) {
            if (x!=root.left.val) return ans = false;
            value(root.left, x);
        }
        if (root.right!=null) {
            if (x!=root.right.val) return ans = false;
           value(root.right, x);
        }
        return ans;
    }
}
