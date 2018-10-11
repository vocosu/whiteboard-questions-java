package hackerrank.trees;

import hackerrank.TreeNode;
import org.junit.Test;
import org.junit.Assert;

public class IsBinarySearchTreeTest {

    /*
            5
          /   \
        3      8
      /   \      \
     1     4      10
    */
    private TreeNode setUpValidBST() {
        TreeNode rootNode = new TreeNode(5);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(8);

        rootNode.left.left = new TreeNode(1);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(10);
        return rootNode;
    }

    /*
            5
          /   \
        9      8
      /   \      \
     1     4      10
    */
    private TreeNode setUpInvalidBST() {
        TreeNode rootNode = new TreeNode(5);
        rootNode.left = new TreeNode(9);
        rootNode.right = new TreeNode(8);

        rootNode.left.left = new TreeNode(1);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(10);
        return rootNode;
    }

    @Test
    public void isBinarySearchTreeRecursiveTestOne() {
        TreeNode tree = setUpValidBST();
        boolean actual = new hackerrank.trees.IsBinarySearchTree().isBinarySearchTreeRecursive(tree);
        Assert.assertTrue(actual);
    }

    @Test
    public void isBinarySearchTreeIterativeTestOne() {
        TreeNode tree = setUpValidBST();
        boolean actual = new hackerrank.trees.IsBinarySearchTree().isBinarySearchTreeIterative(tree);
        Assert.assertTrue(actual);
    }

    @Test
    public void isBinarySearchTreeRecursiveTestTwo() {
        TreeNode tree = setUpInvalidBST();
        boolean actual = new hackerrank.trees.IsBinarySearchTree().isBinarySearchTreeRecursive(tree);
        Assert.assertFalse(actual);
    }

    @Test
    public void isBinarySearchTreeIterativeTestTwo() {
        TreeNode tree = setUpInvalidBST();
        boolean actual = new hackerrank.trees.IsBinarySearchTree().isBinarySearchTreeIterative(tree);
        Assert.assertFalse(actual);
    }
}