package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
/*
Difficulty: Easy
https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

Create function to insert a node at a specific position in a LinkedList
*/
public class InsertNodeAtPosition {
    // Time complexity: O(n)
    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (position == 0) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = head;
            return newNode;
        }

        SinglyLinkedListNode currentNode = head;

        while (position - 1 > 0) {
            currentNode = currentNode.next;
            position--;
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }
}
