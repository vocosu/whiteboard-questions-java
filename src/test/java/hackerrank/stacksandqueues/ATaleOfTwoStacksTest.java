package hackerrank.stacksandqueues;

import org.junit.Test;
import org.junit.Assert;

public class ATaleOfTwoStacksTest {

    @Test
    public void aTaleOfTwoStacksTestOne() {
        ATaleOfTwoStacks queue = new hackerrank.stacksandqueues.ATaleOfTwoStacks();
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.deque();
        int actual = queue.peek();
        int expected = 7;
        Assert.assertEquals(expected, actual);
}

    @Test
    public void aTaleOfTwoStacksTestTwo() {
        ATaleOfTwoStacks queue = new hackerrank.stacksandqueues.ATaleOfTwoStacks();
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.deque();
        queue.deque();
        int actual = queue.peek();
        int expected = 9;
        Assert.assertEquals(expected, actual);
    }
}