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
    public int maxDepth(TreeNode root) {
        return dfs(root);
        
    }
    private int dfs(TreeNode n){
        if(n==null){
            return 0;
        } 
        // Fully explore each subtree before calculating this node's depth.
        int left = dfs(n.left);
        int right = dfs(n.right);
        return 1 + Math.max(left, right);
    }
}
