package Home_Work_Lab_6;

public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();

}
