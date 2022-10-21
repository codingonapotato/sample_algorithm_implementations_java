package data_structures_tests;

import algorithms.InsertionSort;
import data_structures.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSinglyLinkedList {
    private SinglyLinkedList testSinglyLinkedList;
    private Object o1;
    private Object o2;
    private Object o3;

    @BeforeEach
    public void runBefore() {
        // construct linked list object
        testSinglyLinkedList = new SinglyLinkedList();
        o1 = new Object();
        o2 = new Object();
        o3 = new Object();
    }

    @Test
    public void testSinglyLinkedListConstructor() {
        assertTrue(testSinglyLinkedList.isEmpty());
        // not entirely sure why but comparing null using == works but .equals does not
        assertTrue(testSinglyLinkedList.first() == null);
        assertTrue(testSinglyLinkedList.last() == null);
        assertTrue(testSinglyLinkedList.size() == 0);
    }

    @Test
    public void testAddFirst() {
        testSinglyLinkedList.addFirst(o1);
        assertTrue(testSinglyLinkedList.size() == 1);
        assertTrue(testSinglyLinkedList.removeFirst().equals(o1));
        assertTrue(testSinglyLinkedList.size() == 0);
        testSinglyLinkedList.addFirst(o1);
        testSinglyLinkedList.addFirst(o2);
        assertTrue(testSinglyLinkedList.size() == 2);
        assertTrue(testSinglyLinkedList.removeFirst().equals(o2));
    }

    @Test
    public void testAddLast() {
        testSinglyLinkedList.addLast(o1);
        assertTrue(testSinglyLinkedList.size() == 1);
        assertTrue(testSinglyLinkedList.removeFirst().equals(o1));
        assertTrue(testSinglyLinkedList.size() == 0);
        testSinglyLinkedList.addLast(o1);
        testSinglyLinkedList.addLast(o2);
        assertTrue(testSinglyLinkedList.size() == 2);
        assertTrue(testSinglyLinkedList.removeFirst().equals(o1));
    }
}
