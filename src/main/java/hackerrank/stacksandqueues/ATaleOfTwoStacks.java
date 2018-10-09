package hackerrank.stacksandqueues;

import java.util.Stack;
/*
Difficulty: Medium
https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem

Implement a Queue using two stacks.
Implement the peek, queue and enqueue methods.
*/
public class ATaleOfTwoStacks {
    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();

    // Add element to the end of the queue
    public void enqueue(int x) {
        stackOne.push(x);
    }

    // Remove element from the front of the queue and return it
    public int deque() {
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.pop();
    }

    public int peek() {
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.peek();
    }
}
