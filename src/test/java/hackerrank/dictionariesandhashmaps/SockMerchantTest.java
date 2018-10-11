package hackerrank.dictionariesandhashmaps;

import org.junit.Test;
import org.junit.Assert;

public class SockMerchantTest {

    @Test
    public void sockMerchantTestOne() {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int expected = 3;
        int actual = new hackerrank.dictionariesandhashmaps.SockMerchant().sockMerchant(9, arr);
        Assert.assertEquals(expected, actual);
    }
}