package HackerRank.Arrays;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/2d-array/problem

Print the largest (maximum) hourglass sum found in a 2D array.

We define an hourglass sum to be:
a b c
  d
e f g

Sample Input (2D int array)
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output (int)
19
*/
public class Hourglass {
    /*
    O(n) time complexity
    There are 16 hourglasses in the 2D array.
    Loop through the 2D array and compute each hourglass sum.
    */
    public int hourglassSum(int[][] arr) {
        int maxSum = -Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int mid = arr[i + 1][j + 1];
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                int currentSum = top + mid + bottom;
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
