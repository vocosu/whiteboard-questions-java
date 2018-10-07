package hackerrank.arrays;

import org.junit.Test;
import org.junit.Assert;

public class RotateLeftTest {

    @Test
    public void testRotateLeftOne() {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 4;
        int[] expected = {5, 1, 2, 3, 4};
        int[] actual = new hackerrank.arrays.RotateLeft().rotateLeftOne(arr, rotations);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testRotateLeftTwo() {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 4;
        int[] expected = {5, 1, 2, 3, 4};
        int[] actual = new hackerrank.arrays.RotateLeft().rotateLeftTwo(arr, rotations);

        Assert.assertArrayEquals(actual, expected);
    }
}