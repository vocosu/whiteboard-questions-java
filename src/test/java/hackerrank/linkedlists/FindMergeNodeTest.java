package hackerrank.linkedlists;

import hackerrank.SinglyLinkedListNode;
import org.junit.Test;
import org.junit.Assert;

public class FindMergeNodeTest {
    public SinglyLinkedListNode headOne = new SinglyLinkedListNode(1);
    public SinglyLinkedListNode headTwo = new SinglyLinkedListNode(1);

    /*
    Test Case
    1
     \
      2--->3--->NULL
     /
    1
    */
    private void setUpLinkedLists() {
        headOne.next = new SinglyLinkedListNode(2);
        headTwo.next = headOne.next;
        headOne.next.next = new SinglyLinkedListNode(3);
    }

    @Test
    public void findMergeNodeTestOne() {
        setUpLinkedLists();
        int actual = new hackerrank.linkedlists.FindMergeNode().findMergeNode(headOne, headTwo);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}