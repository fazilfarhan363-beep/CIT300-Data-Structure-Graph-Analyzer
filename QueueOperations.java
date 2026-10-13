import java.util.ArrayDeque;
import java.util.Queue;

/** Queue implemented using ArrayDeque (FIFO). */
public class QueueOperations {
    private final Queue<Integer> queue = new ArrayDeque<>();

    public void enqueue(int value) {
        queue.offer(value);
        System.out.println(value + " added to queue.");
    }

    public Integer dequeue() {
        Integer value = queue.poll();
        if (value == null) System.out.println("Queue is empty. Cannot dequeue.");
        else System.out.println("Dequeued: " + value);
        return value;
    }

    public Integer front() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.peek();
    }

    public void display() {
        if (queue.isEmpty()) System.out.println("Queue is empty.");
        else System.out.println("Queue (front to rear): " + queue);
    }
}
