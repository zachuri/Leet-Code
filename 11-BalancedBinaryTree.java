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

// Find the height of each subtree, if the difference 
// between the left subtree and the right subtree is more 
// than 1 then return -1 else return the height of the subtree.
// Time & Space: O(n)

class Solution {
  public boolean isBalanced(TreeNode root) {
    return maxDepth(root) != -1;
  }

  public int maxDepth(TreeNode root) {
    // Base case
    if (root == null) {
      return 0;
    }

    // Recursive call left and right node
    int l = maxDepth(root.left);
    int r = maxDepth(root.right);

    // If left or right has reach max depth
    if (l == -1 || r == -1) {
      return -1;
    }

    // Height of left and right is greater than 1 
    if (Math.abs(l - r) > 1) {
      return -1;
    }

    // Max of left or right add 1
    return 1 + Math.max(l, r);
  }
}
