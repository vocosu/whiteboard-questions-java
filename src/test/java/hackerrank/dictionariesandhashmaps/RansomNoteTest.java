package hackerrank.dictionariesandhashmaps;

import org.junit.Test;
import org.junit.Assert;

public class RansomNoteTest {

    @Test
    public void ransomNoteTestOne() {
        String[] magazineWords = {"give", "me", "one", "grand", "today", "night"};
        String[] ransomWords = {"give", "one", "grand", "today"};
        boolean actual = new hackerrank.dictionariesandhashmaps.RansomNote().ransomNote(magazineWords, ransomWords);
        Assert.assertTrue(actual);
    }

    @Test
    public void ransomNoteTestTwo() {
        String[] magazineWords = {"two", "times", "three", "is", "not", "four"};
        String[] ransomWords = {"two", "times", "two", "is", "four"};
        boolean actual = new hackerrank.dictionariesandhashmaps.RansomNote().ransomNote(magazineWords, ransomWords);
        Assert.assertFalse(actual);
    }
}