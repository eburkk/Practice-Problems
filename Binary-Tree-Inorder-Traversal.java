// Problem: 
// Given a binary tree, return the inorder traversal of its nodes' values.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Recursive Solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        if (root != null) {
            return helper(root, output);
        }  
        return output;
    }
    
    private List<Integer> helper(TreeNode root, List<Integer> out) {
        if (root == null) {
            return out;
        } else {
            helper(root.left, out);
            out.add(root.val);
            helper(root.right, out);
            return out;  
        }
    }
}
