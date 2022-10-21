package data_structures;

import javax.lang.model.element.Element;

public class SinglyLinkedList<Object> {

    // EFFECTS: returns the size of the linked list (number of nodes)
    public int size() {};

    // EFFECTS: returns true if the linked list is empty, false otherwise
    public boolean isEmpty() {};

    //  EFFECTS: returns the first element of the list
    public Node<Object> first() {

    }

    // EFFECTS: returns the last element of the list
    public Node<Object> last() {

    }

    // EFFECTS: appends a new element at the head of the list
    public void addFirst(Object o) {

    }

    // EFFECTS: appends a new element to the tail of the list
    public void addLast(Object o) {

    }

    // EFFECTS: removes and returns the first element of the list
    public Node<Object> removeFirst(Object o) {

    }

    private class Node<Object> {
        private Object o;
        private Node<Object> next;

        public Node(Object o, Node<Object> next) {
            this.o = o;
            this.next = next;
        }

        public Object getObject() {
            return o;
        }

        public Node<Object> getNext() {
            return next;
        }

        public void setNext(Node<Object> next) {
            this.next = next;
        }
    }
}
