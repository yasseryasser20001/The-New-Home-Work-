package Home_Work_Lab_6;

public class LinkedStack<E> implements Stack<E> {

    SinglyLinkedList<E> list = new SinglyLinkedList<E>();



    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E Top() {
        return list.first();
    }

    @Override
    public void push(E element) {
   list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
