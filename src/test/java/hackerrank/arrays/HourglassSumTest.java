package hackerrank.arrays;

import org.junit.Test;
import org.junit.Assert;

public class HourglassSumTest {

    @Test
    public void testHourGlassSum() {
        int[][] hourglass = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };
        int expected = 19;
        int actual = new hackerrank.arrays.HourglassSum().hourglassSum(hourglass);

        Assert.assertEquals(actual, expected);
    }
}