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
        int left = 0;
        int right = 0;
        if(n==null){
            return 0;
        } 
        if(n.left!=null){
            left = dfs(n.left);
        }
        if(n.right!=null){
            right = dfs(n.right);
        }
        return 1 + Math.max(left, right);
    }
}
