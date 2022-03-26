package Home_Work_Lab3;


public class ArratyStack<E> implements Stack<E> {

    E data[];
    static final int CAPACIITY=100;
    int t=-1;

    public ArratyStack(int c) {
        data = (E[]) new Object[c];
    }

    public ArratyStack() {
        this(CAPACIITY);
    }


    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
        if ( size()== data.length)
            throw new IllegalStateException("Stack is full");
        data[++t]=element;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E x = data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    };}
