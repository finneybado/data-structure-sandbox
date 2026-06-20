public class Node<T> {

    // fields
    private T data;
    private Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // getters and setters
    public T getData() {
        return this.data;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }
}
