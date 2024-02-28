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
    public int findBottomLeftValue(TreeNode root) {
        int[] result = new int[]{0, 0};
        help(root, 1, result);
        return result[1];
    }
    private void help(TreeNode node, int currD, int[] result){
      if(node == null){
        return;
      }

      if(currD > result[0]){
        result[0] = currD;
        result[1] = node.val;
      }

      help(node.left, currD+1, result);
      help(node.right, currD+1, result);
    }
}