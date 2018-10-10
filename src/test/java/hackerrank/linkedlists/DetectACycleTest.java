package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
import org.junit.Test;
import org.junit.Assert;

public class DetectACycleTest {

    // 16 -> 13 -> 7 -> 13
    private SinglyLinkedListNode createListWithCycle() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);
        head.next = new SinglyLinkedListNode(13);
        head.next.next = new SinglyLinkedListNode(7);
        head.next.next.next = head.next.next;
        return head;
    }

    // 16 -> 13 -> 7 -> 13
    private SinglyLinkedListNode createListWithoutCycle() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);
        head.next = new SinglyLinkedListNode(13);
        head.next.next = new SinglyLinkedListNode(7);
        return head;
    }


    @Test
    public void hasCycleTestOne() {
        SinglyLinkedListNode head = createListWithCycle();
        boolean actual = new hackerrank.linkedlists.DetectACycle().hasCycle(head);
        Assert.assertTrue(actual);
    }

    @Test
    public void hasCycleTestTwo() {
        SinglyLinkedListNode head = createListWithoutCycle();
        boolean actual = new hackerrank.linkedlists.DetectACycle().hasCycle(head);
        Assert.assertFalse(actual);
    }
}