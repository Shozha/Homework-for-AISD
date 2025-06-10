package homework.Stack;

public class Main {

    public static void main(String[] args) {

        MinStack minStack = new MinStack(6);
        minStack.push(-1);
        minStack.push(5);
        minStack.push(7);
        minStack.push(2);
        minStack.push(3);
        minStack.push(-2);
        System.out.println(minStack.getMin());
        System.out.println(minStack);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
        System.out.println(minStack);

    }

}
