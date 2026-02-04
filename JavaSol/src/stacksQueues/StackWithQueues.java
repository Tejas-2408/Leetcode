package stacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class StackWithQueues {
    private Deque<Integer> first;

    public StackWithQueues() {
        first = new ArrayDeque<>();
    }
    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        return first.removeLast();
    }

    public int top() {
        return first.peekLast();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
