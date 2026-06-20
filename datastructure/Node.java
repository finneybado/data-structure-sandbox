public class Node<T> {

    // fields
    private T data;
    private Node<T> next;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // getters and setters to add
    T getData() {
        return this.data;
    }

    void setData(T newData) {
        this.data = newData;
    }

    Node<T> getNext() {
        return this.next;
    }

    void setNext(Node<T> node) {
        this.next = node;
    }
}
