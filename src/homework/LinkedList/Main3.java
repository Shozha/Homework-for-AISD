package homework.LinkedList;



public class Main3 {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        list.remove("Hello");
        System.out.println(list.get(0));
        System.out.println(list.size());

        MyIterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

    }
}
