package stacksQueues;

// https://leetcode.com/problems/implement-queue-using-stacks/description/?envType=problem-list-v2&envId=queue

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueWithStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.empty()){
            second.push(first.pop());
        }

        int removed = second.pop();
        while (!second.empty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.empty()){
            second.push(first.pop());
        }

        int peeked = second.peek();
        while (!second.empty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.empty();
    }
}
