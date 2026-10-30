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
    public TreeNode invertTree(TreeNode root) {
        return swap(root);
    }
    private TreeNode swap(TreeNode n){
        // base case:
        // if current node is null do nothing
        if(n==null){
            return n;
        } else {
            TreeNode dummy = n.right;
            n.right = swap(n.left);
            n.left = swap(dummy);
            
        }
        return n;
    }
}
