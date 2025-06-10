package homework.Queue;

public class Main {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        int[] arr = new int[] {1, 4, 5, 7, 3, 15};
        for (int j : arr) {
            myQueue.add(j);
        }

        System.out.println(myQueue);
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.add(5);
        myQueue.add(2);
        myQueue.add(7);
        System.out.println(myQueue);

    }

}
