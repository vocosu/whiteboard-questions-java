package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

Test Case
 1
  \
   2--->3--->NULL
  /
 1
*/
public class FindMergeNode {
    private int getLength(SinglyLinkedListNode node) {
        int length = 0;

        while (node.next != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    // Time complexity O(n)
    // Calculate length of both linked lists.
    // Compute the difference.
    // Have a pointer to the node of the longer linked list plus the difference, other pointer at the start of the shorter linked list.
    // Move both pointers one at a time until both references are the same.
    public int findMergeNode(SinglyLinkedListNode headOne, SinglyLinkedListNode headTwo) {
        int lengthOne = getLength(headOne);
        int lengthTwo = getLength(headTwo);

        int difference = Math.abs(lengthOne - lengthTwo);

        SinglyLinkedListNode pointerOne = headOne;
        SinglyLinkedListNode pointerTwo = headTwo;

        if (lengthOne < lengthTwo) {
            pointerOne = headTwo;
            pointerTwo = headOne;
        }

        while (difference > 0) {
            pointerOne = pointerOne.next;
            difference--;
        }

        while (pointerOne != pointerTwo) {
            pointerOne = pointerOne.next;
            pointerTwo = pointerTwo.next;
        }

        return pointerOne.data;
    }
}
