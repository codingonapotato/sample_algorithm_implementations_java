package data_structures;

public class SinglyLinkedList<Object> {
    private Node<Object> head;
    private Node<Object> tail;
    private int size;

    // EFFECTS: initializes fields of the SinglyLinkedList object
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // EFFECTS: returns the size of the linked list (number of nodes)
    public int size() {
        return size;
    };

    // EFFECTS: returns true if the linked list is empty, false otherwise
    public boolean isEmpty() {
        return (size == 0);
    };

    //  EFFECTS: returns the first element of the list
    public Object first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getObject();
        }
    }

    // EFFECTS: returns the last element of the list
    public Object last() {
        if (isEmpty()) {
            return null;
        } else
            return tail.getObject();
    }

    // EFFECTS: appends a new element at the head of the list
    public void addFirst(Object o) {
        Node<Object> newHead = new Node(o, head);
        head = newHead;
        if (size == 0) {
            tail = newHead;
        } // accounts for special case where this is the first element added ever to the SinglyLinkedList
        size++;
    }

    // EFFECTS: appends a new element to the tail of the list
    public void addLast(Object o) {
        Node<Object> newTail = new Node(o, null);
        if (size == 0) {
            head = newTail;
        } else {
            tail.setNext(newTail);
        }
        tail = newTail;
        size++;
    }

    // EFFECTS: removes and returns the first element of the list
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Object o = head.getObject();
            head = head.getNext();
            size--;
            return o;
        }
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
