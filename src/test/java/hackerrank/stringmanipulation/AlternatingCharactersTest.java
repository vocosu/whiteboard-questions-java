package hackerrank.stringmanipulation;

import org.junit.Test;
import org.junit.Assert;

public class AlternatingCharactersTest {

    @Test
    public void alternatingCharactersTestOne() {
        String s = "AAAA";
        int expected = 3;
        int actual = new hackerrank.stringmanipulation.AlternatingCharacters().alternatingCharacters(s);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void alternatingCharactersTestTwo() {
        String s = "BBBBB";
        int expected = 4;
        int actual = new hackerrank.stringmanipulation.AlternatingCharacters().alternatingCharacters(s);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void alternatingCharactersTestThree() {
        String s = "ABABABAB";
        int expected = 0;
        int actual = new hackerrank.stringmanipulation.AlternatingCharacters().alternatingCharacters(s);

        Assert.assertEquals(actual, expected);
    }
}