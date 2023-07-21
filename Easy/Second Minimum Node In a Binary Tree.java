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
    HashSet<Integer> set;
    public int findSecondMinimumValue(TreeNode root) {
        set = new HashSet<>();
        inorder(root);

        List<Integer> list = new ArrayList<>(set);

        return helper(list);
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        set.add(root.val);
        inorder(root.right);
    }
    public int helper(List<Integer> list){
        // collection.sort(list, collections.reverseOrder());
        if(list.size() == 0){
            return -1;
        }
        if(list.size() == 1){
            return -1;
        }
        Collections.sort(list);
        return list.get(1);

    }
}
