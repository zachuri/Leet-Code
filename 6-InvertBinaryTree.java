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
    //1. check if root is null
    //2. Recursive call invertTree() for left and right 
    //3. make the switch

    // Base case if root is null
    if (root == null) {
      return root;
    }

    // Recrusive call
    invertTree(root.left);
    invertTree(root.right);

    // Switch
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    return root;
  }
}