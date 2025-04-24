import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue);

        // Dequeue element
        String removed = queue.poll();
        System.out.println("Removed element: " + removed);

        System.out.println("Queue after removal: " + queue);

        // Peek element
        String head = queue.peek();
        System.out.println("Front element: " + head);
    }
}
