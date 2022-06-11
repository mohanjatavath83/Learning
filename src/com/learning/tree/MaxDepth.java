package com.learning.tree;

public class MaxDepth {

    static int depth1 = 0;

    public void maxDepth(TreeNode root, int depth) {
        if (root == null)
            return;
        else if (root.left == null && root.right == null) {
            if (depth1 < depth) {
                depth1 = depth;

            } else {
                maxDepth(root.left, depth + 1);
                maxDepth(root.right, depth + 1);
            }

        }
    }


    public int maxDepth(TreeNode root) {

        maxDepth(root, 1);

        return depth1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }
}
