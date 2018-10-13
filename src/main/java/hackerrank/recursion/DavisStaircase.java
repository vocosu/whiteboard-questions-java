package hackerrank.recursion;

import java.util.Map;

/*
Difficulty: Medium
https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem

Davis has a number of staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time.
Complete a function given the number of steps, how many ways there are to reach the top of the staircase.

*/
public class DavisStaircase {
    // Time complexity: O(n)
    // Recursive relationship is F(n) = F(n - 1) + F(n - 2) + F(n - 3)
    public int stepPermsIterative(int n) {
        if (n <= 1) {
            return n;
        }

        if (n == 2) {
            return 2;
        }

        if (n == 3) {
            return 4;
        }


        int[] ways = {1, 2, 4};

        for (int i = 4; i < n; i++) {
            int index = (i - 1) % 3;
            ways[index] = ways[0] + ways[1] + ways[2];
        }
        return ways[0] + ways[1] + ways[2];
    }
}
