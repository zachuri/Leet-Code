/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Recursive
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode r = root;

    if (r.val > p.val && r.val < q.val) {
      return r;
    }
    else if (r.val > p.val && r.val > q.val) {
      return lowestCommonAncestor(root.left, p, q);
    }
    else if (r.val < p.val && r.val < q.val) {
      return lowestCommonAncestor(root.right, p, q);
    }

    return root;
  }
}

//Iterative
// class Solution {
//   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//     TreeNode r = root;

//     while (t != null) {
//       if (p.val > r.val && q.val > r.val) {
//         r = r.right;
//       }
//       else if (p.val < r.val && q.val < r.val) {
//         r = r.left;
//       }
//       else {
//         return t;
//       }
//     }

//     return null;
//   }
// }