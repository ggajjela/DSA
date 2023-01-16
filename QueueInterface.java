public interface QueueInterface {
    void enqueue(int key);

    int dequeue();

    int front();

    int rear();

    int size();

    boolean isEmpty();

    boolean isFull();

    void printQueue();

}
