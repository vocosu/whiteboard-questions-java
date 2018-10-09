package hackerrank.dictionariesandhashmaps;

import org.junit.Test;
import org.junit.Assert;

public class TwoStringsTest {

    @Test
    public void twoStringsTestOne() {
        String s1 = "hello";
        String s2 = "world";
        boolean actual = new hackerrank.dictionariesandhashmaps.TwoStrings().twoStrings(s1, s2);
        Assert.assertTrue(actual);
    }

    @Test
    public void twoStringsTestTwo() {
        String s1 = "hi";
        String s2 = "world";
        boolean actual = new hackerrank.dictionariesandhashmaps.TwoStrings().twoStrings(s1, s2);
        Assert.assertFalse(actual);
    }
}