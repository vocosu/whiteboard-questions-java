package hackerrank.greedyalgorithms;

import org.junit.Test;
import org.junit.Assert;

public class LuckBalanceTest {

    @Test
    public void luckBalanceTestOne() {
        int[][] list = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
        int actual = new hackerrank.greedyalgorithms.LuckBalance().luckBalance(3, list);
        int expected = 29;
        Assert.assertEquals(expected, actual);
    }
}