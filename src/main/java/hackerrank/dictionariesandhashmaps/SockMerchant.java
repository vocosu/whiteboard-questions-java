package hackerrank.dictionariesandhashmaps;

import java.util.HashSet;
import java.util.Set;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/sock-merchant/problem

Sample Input:
9
10 20 20 10 10 30 50 10 20

Sample Output:
3

*/
public class SockMerchant {
    // Time complexity: O(n)
    public int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int totalPairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                totalPairs++;
                colors.remove(ar[i]);
            }
        }

        return totalPairs;
    }
}
