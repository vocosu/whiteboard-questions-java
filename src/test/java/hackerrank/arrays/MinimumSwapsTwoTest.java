package hackerrank.arrays;

import org.junit.Test;
import org.junit.Assert;

public class MinimumSwapsTwoTest {

    @Test
    public void minimumSwapsTwoTestOne() {
        int[] arr = {2, 3, 4, 1, 5};
        int actual = new hackerrank.arrays.MinimumSwapsTwo().minimumSwapsTwo(arr);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumSwapsTestTwo() {
        int[] arr = {4, 3, 1, 2};
        int actual = new hackerrank.arrays.MinimumSwapsTwo().minimumSwapsTwo(arr);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}