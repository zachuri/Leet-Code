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
  public int diameterOfBinaryTree(TreeNode root) {
    // Store value of diameter -> is able to change within the function
    int[] diameter = {0};
    dfs(root, diameter);
    return diameter[0];
  }

  public int dfs(TreeNode root, int[] diameter) {
    // Base case
    if (root == null) {
      return 0;
    }

    // traverse through left and right
    int leftDiameter = dfs(root.left, diameter);
    int rightDiameter = dfs(root.right, diameter);

    // Obtain the diameter
    diameter[0] = Math.max(leftDiameter + rightDiameter, diameter[0]);

    // Traverse through left or right with greater height
    return Math.max(leftDiameter ,rightDiameter) + 1;
  }
}