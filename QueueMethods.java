public class QueueMethods implements QueueInterface {
    private  Node head;
    private int queueSize;
    private int maxSize;

    public QueueMethods(int size) {
        maxSize = size;
        head = null;
        queueSize = 0;
    }

    @Override
    public void enqueue(int key) {
        Node newNode = null;
        try {
            newNode = new Node(key);
        } catch (OutOfMemoryError oom) {
            System.err.println("Memory allocation failed for new node");
        }
        newNode.next = null;

        if (head == null) {
            head = newNode;
            queueSize++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        queueSize++;
        return;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty. Cannot dequeue any keys");
            return -1;
        }
        int key = head.data;
        head = head.next;
        queueSize--;
        System.out.println("the dequeued key is: " + key);
        return key;
    }

    @Override
    public int front() {
        if (isEmpty()) {
            return -1;
        }
        System.out.println("The front key of the queue is: " + head.data);
        return head.data;
    }

    @Override
    public int rear() {
        if (isEmpty()) {
            return -1;
        }

        Node temp = null;
        for (temp = head; temp.next != null; temp = temp.next);
        System.out.println("The rear key of the queue is: " + temp.data);
        return temp.data;
    }

    @Override
    public int size() {
        return queueSize;
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
        if (queueSize == maxSize) {
            return true;
        }
        return false;
    }

    @Override
    public void printQueue() {

        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
}
