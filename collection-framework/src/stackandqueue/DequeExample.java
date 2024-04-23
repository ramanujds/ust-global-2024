package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Orange");
        deque.addLast("Blue");
        deque.addFirst("Red");
        deque.addLast("Green");
        deque.addLast("Yellow");

        System.out.println(deque);

    }
}
