package hackerrank.stringmanipulation;

/*
Difficulty: Easy
https://www.hackerrank.com/challenges/alternating-characters/problem

Given a string, return an integer representing the minimum number of deletions to make
the string alternating.

Each string s will only consist of characters A and B.
Sample Input: AAAA
Sample Output: 3

Sample Input: BBBBB
Sample Output: 4

Sample Input: ABABABAB
Sample Output: 0
*/
public class AlternatingCharacters {
    /*
    Time complexity: O(n)
    */
    public int alternatingCharacters(String s) {
        int count = 0;
        char current = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (current == s.charAt(i)) {
                count++;
            }
            current = s.charAt(i);
        }

        return count;
    }
}
