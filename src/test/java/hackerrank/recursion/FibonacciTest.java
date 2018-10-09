package hackerrank.recursion;

import org.junit.Test;
import org.junit.Assert;

public class FibonacciTest {

    @Test
    public void fibonacciRecursiveTestOne() {
        int expected = 13;
        int actual = new hackerrank.recursion.Fibonacci().fibonacciRecursive(7);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void fibonacciCachedTestOne() {
        int expected = 5;
        int actual = new hackerrank.recursion.Fibonacci().fibonacciCached(5);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void fibonacciIterativeTestOne() {
        int expected = 8;
        int actual = new hackerrank.recursion.Fibonacci().fibonacciIterative(6);
        Assert.assertEquals(actual, expected);
    }
}