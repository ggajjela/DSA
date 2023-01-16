public class QueueTest {
    public static void main (String[] args) {

        QueueMethods Queue = new QueueMethods(5);

        Queue.enqueue(5);
        Queue.enqueue(9);
        Queue.enqueue(6);
        Queue.enqueue(8);
        Queue.enqueue(4);
        Queue.front();
        Queue.printQueue();

        Queue.dequeue();
        Queue.dequeue();
        Queue.front();
        Queue.printQueue();
        Queue.rear();
        Queue.printQueue();
    }
}
