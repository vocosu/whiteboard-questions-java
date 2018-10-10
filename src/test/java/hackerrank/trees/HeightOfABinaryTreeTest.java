package hackerrank.trees;

import hackerrank.TreeNode;
import org.junit.Test;
import org.junit.Assert;

public class HeightOfABinaryTreeTest {

    /*
            5
          /   \
        3      8
      /   \      \
     1     4      10
    */
    private TreeNode setUpTreeOne() {
        TreeNode rootNode = new TreeNode(2);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(8);

        rootNode.left.left = new TreeNode(1);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(10);
        return rootNode;
    }

    @Test
    public void heightRecursiveTestOne() {
        TreeNode root = setUpTreeOne();
        int actual = new hackerrank.trees.HeightOfABinaryTree().heightRecursive(root);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void heightIterativeTestOne() {
        TreeNode root = setUpTreeOne();
        int actual = new hackerrank.trees.HeightOfABinaryTree().heightIterative(root);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}