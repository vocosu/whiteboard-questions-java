package hackerrank.trees;

import java.util.LinkedList;
import java.util.Queue;
import hackerrank.TreeNode;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem

Write a function to compute a height of a binary tree.
*/
public class HeightOfABinaryTree {
    // Time complexity O(n)
    public int heightRecursive(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = heightRecursive(root.left);
        int rightHeight = heightRecursive(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Time complexity O(n)
    public int heightIterative(TreeNode root) {
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                size--;
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }

        return count;
    }
}
