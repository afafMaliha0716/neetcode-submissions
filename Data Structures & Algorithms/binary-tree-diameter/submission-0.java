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
https://imagedelivery.net/CLfkmk9Wzy8_9HRyug4EVA/90e1d7a0-4322-4c5d-c59b-dde2bf92bb00/public$0 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        // would it be the max depth + second max depth?
        // so maybe find the max depth? then the second max depth? and add them together?
        // that would not work
        // eveyr pathw ould have to pass through a parent node.
        // the max depth from each parent node and total the right and left up and the max of those numbers from all the parent nodes is the diameter?
        // complexity would be O(N) necause you visit every node
        // so lets calculate max depth from every node
        if(root== null){
            return 0;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        int diameter = leftHeight + rightHeight;
        int subTree = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(subTree, diameter);
        
    }
    private int dfs(TreeNode n){
        if(n == null){
            return 0;
        } 
        return 1+ Math.max(dfs(n.right), dfs(n.left));
    }
}
