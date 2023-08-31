// Invert Binary Tree
// Easy
// https://leetcode.com/problems/invert-binary-tree

// Given the root of a binary tree, invert the tree, and return its root.
// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]

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
class 6_ReverseBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root; // base case

        TreeNode left = invertTree(root.left); // recursive inversion of sub trees
        TreeNode right = invertTree(root.right);

        // Swap
        root.right = left;
        root.left = right;

        return root;
    }
}


// Runtime: 0 ms
// Memory: 39.9 MB