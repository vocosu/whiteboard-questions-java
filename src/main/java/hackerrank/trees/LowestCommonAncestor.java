package hackerrank.trees;

import hackerrank.TreeNode;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem

Complete a function to compute the lca of a binary tree given a root and two integers.
Assume v1 is always less than v2.
*/

public class LowestCommonAncestor {
    // Time complexity: O(n)
    public TreeNode lcaRecursive(TreeNode root, int v1, int v2) {
        if (v1 < root.data && v2 < root.data) {
            return lcaRecursive(root.left, v1, v2);
        }

        if (v1 > root.data && v2 > root.data) {
            return lcaRecursive(root.right, v1, v2);
        }

        return root;
    }

    // Time complexity: O(n)
    public TreeNode lcaIterative(TreeNode root, int v1, int v2) {
        while (true) {
            if (v1 < root.data && v2 < root.data) {
                root = root.left;
            } else if (v1 > root.data && v2 > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
    }
}
