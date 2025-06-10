package homework.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stek {

    private int[] stek;
    private int top;
    private int size;

    public Stek() {
        this(10);
    }

    public Stek(int size) {
        stek = new int[size];
        this.size = size;
        top = -1;
    }

    private boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(int x) {
        if (!isFull()) {
            stek[++top] = x;
            return true;
        }
        return false;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stek[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stek[top];
    }

    @Override
    public String toString() {
        return "Stek{" +
                "stek=" + Arrays.toString(stek) +
                ", top=" + top +
                ", size=" + size +
                '}';
    }
}
