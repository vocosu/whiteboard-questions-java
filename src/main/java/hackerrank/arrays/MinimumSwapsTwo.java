package hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
/*
Difficulty: Medium
https://www.hackerrank.com/challenges/minimum-swaps-2/problem

Given an array consisting of consecutive integers without any duplicates.
Find the minimum number of swaps required to sort the array in ascending order.
The highest number in the array will be the length of the array.

Sample Input
[2, 3, 4, 1, 5]

Sample Output
3
*/
public class MinimumSwapsTwo {
    /*
    Time complexity: O(n log n)
    */
    public int minimumSwapsTwo(int[] arr) {
        int counter = 0;
        boolean[] visited = new boolean[arr.length]; // Initialized to false by default
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], i);
        }

        Object[] keys = hash.keySet().toArray();
        Arrays.sort(keys); // Sort keys in ascending order

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || hash.get(keys[i]) == i) {
                continue;
            }

            int cycleCount = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = hash.get(keys[j]);
                cycleCount++;
            }

            counter = counter + cycleCount - 1;
        }

        return counter;
    }
}
