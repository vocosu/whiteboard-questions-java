package hackerrank.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

/*
Difficulty: Easy
https://www.hackerrank.com/challenges/two-strings/problem

Given two strings, determine if they share a common substring.
A substring may be as small as one character.

Sample Input:
hello
world

Sample Output:
True

Sample Input:
hi
world

Sample Output:
False
*/
public class TwoStrings {
    public boolean twoStrings(String s1, String s2) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, true);
            }
        }

        for (int j = 0; j < s2.length(); j++) {
            char c = s2.charAt(j);
            if (map.containsKey(c)) {
                return true;
            }
        }

        return false;
    }
}
