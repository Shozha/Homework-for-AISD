package homework.LinkedList;

public interface MyList<T> {

    void add(T element);

    void remove(T element);

    T get(int index);

    int size();

    MyIterator<T> iterator();

}
