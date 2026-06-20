public class BinaryNode<T> extends Node<T> {

    // fields
    private BinaryNode<T> left;

    // constructor
    public BinaryNode(T data) {
        super(data);
        this.right = this.getNext();
        this.left = null;
    }

    // Setters and Getters
    public BinaryNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BinaryNode<T> newLeft) {
        this.left = newLeft;
    }

    public BinaryNode<T> getRight() {
        return this.getNext;
    }

    public void setRight(BinaryNode<T> newRight) {
        this.setNext(newRight);
    }
}
