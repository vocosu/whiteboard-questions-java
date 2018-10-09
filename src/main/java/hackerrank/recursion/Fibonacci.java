package hackerrank.recursion;

import java.util.HashMap;
import java.util.Map;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem

Complete the function fibonacci to return the nth element in the Fibonacci Sequence.
Ex: 0, 1, 1, 2, 3, 5, 8

Sample Input:
3

Sample Output:
2
*/
public class Fibonacci {
    private static Map<Integer, Integer> results = new HashMap<>();

    /*
    Time complexity: O(2^n)
    */
    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /*
    Time complexity: O(2n)
    Space complexity: O(n)
    */
    public int fibonacciCached(int n) {
        if (n <= 1) {
            return n;
        }

        if (results.get(n) != null) {
            return results.get(n);
        } else {
            int v = fibonacciCached(n - 1) + fibonacciCached(n - 2);
            results.put(n, v);
            return v;
        }
    }

    /*
    Time complexity: O(n)
    */
    public int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;

        while (n > 0) {
            int temp = b;
            b = a + b;
            a = temp;
            n--;
        }

        return a;
    }
}
