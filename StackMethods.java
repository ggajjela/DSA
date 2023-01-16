
public class StackMethods extends LinkedListMethods implements StackInterface {
    private Node head;
    private int maxSize;
    private int stackSize;

    public StackMethods(int size) {
        maxSize = size;
        head = null;
        stackSize = 0;
    }

    @Override
    public void push(int key) {

        if (isFull()) {
            System.out.println("The stack is full. Cannot push key - " + key);
            return;
        }

        Node newNode = null;
        try {
            newNode = new Node(key);
        } catch (OutOfMemoryError oom) {
            System.err.println("Memory allocation failed for new node");
        }

        newNode.next = head;
        head = newNode;
        stackSize++;
    }

    @Override
    public int pop() {

        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot pop any keys.");
            return -1;
        }

        int data = head.data;
        head = head.next;
        stackSize--;
        return data;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        return head.data;
    }

    @Override
    public int size() {
        return stackSize;
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        }
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(" <- " + temp.data);
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (stackSize == maxSize) {
            return true;
        }
        return false;
    }
}