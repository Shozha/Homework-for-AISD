package homework.Stack;

import java.util.EmptyStackException;

public class MinStack {

    private Stek stack1;
    private Stek stack2;

    public MinStack(int size) {
        stack1 = new Stek(size);
        stack2 = new Stek(size);
    }

    public boolean push(int x) {
        if (!stack1.push(x)) {
            return false;
        }

        if (stack2.isEmpty() || x <= stack2.peek()) {
            stack2.push(x);
        } else {
            stack2.push(stack2.peek());
        }
        return true;
    }

    public int pop() {
        if (stack1.isEmpty()) {
            throw new EmptyStackException();
        }
        stack2.pop();
        return stack1.pop();
    }

    public int getMin() {
        if (stack2.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack2.peek();
    }

    @Override
    public String toString() {
        return "MinStack{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
