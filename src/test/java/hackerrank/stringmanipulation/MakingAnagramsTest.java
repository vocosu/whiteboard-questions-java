package hackerrank.stringmanipulation;

import org.junit.Test;
import org.junit.Assert;

public class MakingAnagramsTest {

    @Test
    public void makeAnagramsTestOne() {
        String a = "cde";
        String b = "abc";
        int expected = 4;
        int actual = new hackerrank.stringmanipulation.MakingAnagrams().makeAnagrams(a, b);

        Assert.assertEquals(actual, expected);
    }
}