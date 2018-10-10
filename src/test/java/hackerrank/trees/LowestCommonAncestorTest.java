package hackerrank.trees;

import hackerrank.TreeNode;
import org.junit.Test;
import org.junit.Assert;

public class LowestCommonAncestorTest {

    /*
            5
          /   \
        3      8
      /   \      \
     1     4      10
    */
    private TreeNode setUpTreeOne() {
        TreeNode rootNode = new TreeNode(5);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(8);

        rootNode.left.left = new TreeNode(1);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(10);
        return rootNode;
    }

    @Test
    public void lcaRecursiveTestOne() {
        TreeNode node = setUpTreeOne();
        int actual = new hackerrank.trees.LowestCommonAncestor().lcaRecursive(node, 1, 4).data;
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lcaIterativeTestOne() {
        TreeNode node = setUpTreeOne();
        int actual = new hackerrank.trees.LowestCommonAncestor().lcaRecursive(node, 1, 4).data;
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}