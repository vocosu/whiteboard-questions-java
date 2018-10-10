package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
import org.junit.Test;
import org.junit.Assert;

public class InsertNodeAtPositionTest {

    // 16 -> 13 -> 7
    private SinglyLinkedListNode createList() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);
        head.next = new SinglyLinkedListNode(13);
        head.next.next = new SinglyLinkedListNode(7);
        return head;
    }

    @Test
    public void insertNodeAtPosition() {
        SinglyLinkedListNode head = createList();
        SinglyLinkedListNode actual = new hackerrank.linkedlists.InsertNodeAtPosition().insertNodeAtPosition(head, 1, 2);
        // 16 -> 13 -> 1 -> 7
        Assert.assertEquals(actual.data, 16);
        Assert.assertEquals(actual.next.data, 13);
        Assert.assertEquals(actual.next.next.data, 1);
        Assert.assertEquals(actual.next.next.next.data, 7);
    }
}