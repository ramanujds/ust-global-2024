package stackandqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("Harsh");
        queue.offer("Manish");
        queue.offer("Karan");
        queue.offer("Rohan");


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
