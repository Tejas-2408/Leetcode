package stacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithQueues {
    private Queue<Integer> first;
    private Queue<Integer> second;

    public StackWithQueues() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        while (!first.isEmpty()){
            second.add(first.remove());
        }

        int removed = second.remove();
        while (!second.isEmpty()){
            first.add(second.remove());
        }
        return removed;
    }

    public int top() {
        while (!first.isEmpty()){
            second.add(first.remove());
        }

        int peeked = second.peek();
        while (!second.isEmpty()){
            first.add(second.remove());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
