package hackerrank.stacksandqueues;

import org.junit.Test;
import org.junit.Assert;

public class BalancedBracketsTest {

    @Test
    public void isBalancedTestOne() {
        String s = "{[()]}";
        boolean actual = new hackerrank.stacksandqueues.BalancedBrackets().isBalanced(s);
        Assert.assertTrue(actual);
    }

    @Test
    public void isBalancedTestTwo() {
        String s = "{[(])}";
        boolean actual = new hackerrank.stacksandqueues.BalancedBrackets().isBalanced(s);
        Assert.assertFalse(actual);
    }

    @Test
    public void isBalancedTestThree() {
        String s = "{{[[(())]]}}";
        boolean actual = new hackerrank.stacksandqueues.BalancedBrackets().isBalanced(s);
        Assert.assertTrue(actual);
    }
}