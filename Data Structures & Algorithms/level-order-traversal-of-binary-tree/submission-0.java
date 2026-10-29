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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root==null){
            return new ArrayList<>();
        }

        // so you want to start from teh root, then go through all fo its children, as you add those children to the queue add them to an arrayList.
        queue.offer(root);
  
        while(!queue.isEmpty()){
            int size = queue.size();
          
            List<Integer> level = new ArrayList<>();

            for(int i =0; i<size; i++){
                TreeNode n = queue.poll();
                level.add(n.val);
                  // then visit the nighbors and add them to the list
                if(n.left!= null){
                    queue.offer(n.left);
                    
                }
                if(n.right!= null){
                    queue.offer(n.right);
                }
            }
            result.add(level);
          
        }
        return result;
    }
}
