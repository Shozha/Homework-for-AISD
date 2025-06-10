package homework.LinkedList;

public class MyLinkedList<T> implements MyList<T> {

    private static class MyNode<T> {
        private T value;
        private MyNode<T> next;

        private MyNode(T value) {
            this.value = value;
        }
    }

    private class MyLinkedListIterator implements MyIterator<T> {

        private MyNode<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.value;
            current = current.next;
            return result;
        }
    }

    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public void add(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    @Override
    public void remove(T element) {
        MyNode<T> previous = null;
        MyNode<T> current = head;
        while (current != null) {
            if (current.value.equals(element)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) {
                        tail = null;
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        tail = previous;
                    }
                }
                length--;
            } else {
                previous = current;
            }
            current = current.next;
        }
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.value;
            }
            i++;
            current = current.next;
        }
        return null;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyLinkedListIterator();
    }
}
