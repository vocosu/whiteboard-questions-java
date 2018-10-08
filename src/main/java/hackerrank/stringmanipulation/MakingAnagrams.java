package hackerrank.stringmanipulation;

/*
Difficulty: Easy
https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input (Need to delete d, e, a and b)
cde
abc

Sample Output
4
*/
public class MakingAnagrams {
    /*
    Time Complexity: O(n)
    */
    public int makeAnagrams(String a, String b) {
        int[] missingTracker = new int[26]; // Initialize all array elements to 0
        if (a.equals(b)) {
            return 0;
        }
        for (int i = 0; i < a.length(); i++) {
            missingTracker[a.charAt(i) - (int) 'a']--; // a -> 0, b -> 1, c-> 2, etc..
        }

        for (int j = 0; j < b.length(); j++) {
            missingTracker[b.charAt(j) - (int) 'a']++; // a -> 0, b -> 1, c-> 2, etc..
        }

        int count = 0;
        for (int i : missingTracker) {
            count += Math.abs(i);
        }

        return count;
    }
}
