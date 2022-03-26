package Home_Work_Lab_6;

public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private  int size=0;

    public SinglyLinkedList() {
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if (isEmpty())return null;
        return head.getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E el){
        head= new Node<E>(el,head);
        if (size==0)
            tail=head;
            size++;
    }
    public void addlast(E el){
        Node<E> newest = new Node<E>(el , null);
        if (size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
         return del;

    }





    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }


        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
