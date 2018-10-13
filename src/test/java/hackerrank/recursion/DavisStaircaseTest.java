package hackerrank.recursion;

import org.junit.Test;
import org.junit.Assert;

public class DavisStaircaseTest {

    @Test
    public void stepPermsIterativeTestOne() {
        int actual = new hackerrank.recursion.DavisStaircase().stepPermsIterative(5);
        int expected = 13;
        Assert.assertEquals(expected, actual);
    }
}