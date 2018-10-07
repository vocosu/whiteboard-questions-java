package hackerrank.arrays;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

Complete a function to perform left rotation on an array.

Sample Input:
[1, 2, 3, 4, 5]
4

Sample Output:
[5, 1, 2, 3, 4]
*/
public class RotateLeft {
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
    Time complexity: O(n). n elements are reversed a total of 3 times.
    Reverse entire array, then reverse the two halves.
    */
    public int[] rotateLeftOne(int[] arr, int rotations) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - rotations - 1);
        reverse(arr, arr.length - rotations, arr.length - 1);
        return arr;
    }

    /*
    Time complexity: O(n). One for loop is used to loop through the array
    Space complexity: O(n). Another array of the same size is used.
    */
    public int[] rotateLeftTwo(int[] arr, int rotations) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[(i + arr.length - rotations) % arr.length] = arr[i];
        }

        return newArray;
    }
}
