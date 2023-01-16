public class LinkedListMethods implements LinkedListInterface{
    private Node head;
    private int listSize;

    public LinkedListMethods() {head = null;}

    // add at beginning of the list
    @Override
    public void addAtHead(int key) {

        Node newNode = null;
        try {
            newNode = new Node(key);
        } catch (OutOfMemoryError oom) {
            System.err.println("Memory allocation failed for newNode");
        }

        // add at beginning
        assert newNode != null;
        newNode.next = head;
        head = newNode;
        listSize++;
    }
    @Override
    public void addAtTail(int key) {

        Node newNode = null;
        try {
            newNode = new Node(key);
        } catch (OutOfMemoryError oom) {
            System.err.println("Memory allocation failed for new node");
        }
        newNode.next = null;

        // first node in the list
        if (head == null) {
            head = newNode;
            listSize++;
            return;
        }

        // walk through the list and add newNode at the end
        Node temp = head;
        while (temp.next != null ) {
            temp = temp.next;
        }
        temp.next = newNode;
        listSize++;
    }

    @Override
    public boolean addAtIndex(int index, int key) {

        // boundary checks
        if (index < 0 || index > listSize) {
            System.out.println("Cannot add " + key + " at index " + index + " because list size is " + listSize);
            return false;
        }

        // add at the beginning of list if the index is zero
        if (index == 0) {
            addAtHead(key);
            return true;
        }

        Node newNode = null;
        try {
            newNode = new Node(key);
        } catch (OutOfMemoryError oom) {
            System.err.println("Memory allocation failed for new node");
        }

        Node temp = head;
        for (int i = 0; i < (index - 1); i++) {
            temp = temp.next;
        }
        Node nextNode = temp.next;
        temp.next = newNode;
        temp.next.next = nextNode;
        listSize++;
        return true;
    }

    @Override
    public boolean search(int key) {

        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.data == key) {
                System.out.println(key + " is in the list");
                return true;
            }
        }
        System.out.println(key + " is not in the list");
        return false;
    }

    @Override
    public boolean remove(int key) {

        if (head == null) {
            return false;
        }

        if (head.data == key) {
            head = head.next;
            listSize--;
            System.out.println(key + " is removed from the list");
            return true;
        }

        Node temp = head;
        while (temp.next != null) {

            if (temp.next.data == key) {
                temp.next = temp.next.next;
                listSize--;
                System.out.println(key + " is removed from the list");
                return true;
            }
            temp = temp.next;
        }
        System.out.println(key + " is not in the list");
        return false;
    }

    public boolean removeAtIndex(int index) {

        // boundary check
        if (head == null || index < 0 || index >= listSize) {
            System.out.println("the index " + index + " is out of bounds");
            return false;
        }

        if (index == 0) {
            head = head.next;
            listSize--;
            System.out.println("data found at index " + index + " is removed from the list");
            return true;
        }

        Node temp = head;
        for (int i = 0; i < (index - 1); i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        listSize--;
        System.out.println("data found at index " + index + " is removed from the list");
        return true;
    }

    public Node getHead() {
        return head;
    }
    public void printList() {
        Node temp;
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int listLen() {
        return listSize;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
}
