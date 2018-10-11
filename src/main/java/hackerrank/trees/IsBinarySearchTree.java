package hackerrank.trees;

import hackerrank.TreeNode;
import java.util.Stack;
/*
Difficulty: Medium
https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem

We define a binary search tree to be a binary tree with the following properties:

The value of every node in a node's left subtree is less than the data value of that node.
The value of every node in a node's right subtree is greater than the data value of that node.
The value of every node is distinct.

Write a function to determine if a binary tree is a binary search tree.
*/
public class IsBinarySearchTree {
    private boolean checkBST(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        return min < node.data && node.data < max &&
                checkBST(node.left, min, node.data) &&
                checkBST(node.right, node.data, max);
    }

    // Time complexity O(n)
    public boolean isBinarySearchTreeRecursive(TreeNode root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Time complexity O(n), in order traversal
    public boolean isBinarySearchTreeIterative(TreeNode root) {
       if (root == null) {
           return true;
       }

       Stack<TreeNode> stack = new Stack<>();
       TreeNode previous = null;

       while (root != null || !stack.isEmpty()) {
           while (root != null) { // Move all the way to the leftmost node
               stack.push(root);
               root = root.left;
           }
           root = stack.pop();
           if (previous != null && root.data <= previous.data) { // If current node is less than the previous node
               return false;
           }
           previous = root;
           root = root.right;
       }
       return true;
    }
}
