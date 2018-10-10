package hackerrank.dictionariesandhashmaps;

import java.util.Hashtable;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/ctci-ransom-note/problem

Complete a function to detect whether the second line can
be constructed with words from the first line. No word can be used
more than once.

Sample Input:
give me one grand today night
give one grand today

Sample Output:
True

Sample Input:
two times three is not four
two times two is four

Sample Output:
False
*/
public class RansomNote {
    // Time complexity O(n + m)
    public boolean ransomNote(String[] magazineWords, String[] ransomWords) {
        Hashtable<String, Integer> magazine = new Hashtable<>();

        for (String s : magazineWords) {
            if (magazine.containsKey(s)) {
                magazine.put(s, magazine.get(s) + 1);
            } else {
                magazine.put(s, 1);
            }
        }

        for (String s : ransomWords) {
            if (!magazine.containsKey(s)) {
                return false;
            }

            int counter = magazine.get(s) - 1;

            if (counter == 0) {
                magazine.remove(s);
            } else {
                magazine.put(s, counter);
            }
        }

        return true;
    }
}
