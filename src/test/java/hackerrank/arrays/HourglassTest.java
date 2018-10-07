package hackerrank.arrays;

import org.junit.Test;
import org.junit.Assert;

public class HourglassTest {

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

        int sum = new HackerRank.Arrays.Hourglass().hourglassSum(hourglass);
        Assert.assertEquals(sum, 19);
    }
}