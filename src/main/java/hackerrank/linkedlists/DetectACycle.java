package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

Write a function to detect whether a linked list has a cycle;
*/
public class DetectACycle {
    // Time complexity: O(n)
    public boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
