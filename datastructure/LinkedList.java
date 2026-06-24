public class LinkedList{

    //fields
    private Node<T> head;
    private int size;

    // constructor
    public LinkedList(){
        this.head = null;
        this.size = 0
    }

    // Getters and Setters
    public Node<T> getHead(){
        return this.head;
    }

    private void setHead(Node<T> node){
        this.head = node;
    }


    public int size(){
        return this.size;
    }


    private void incrementSize(){
        this.size++;
    }

    private void decrementSize(){
        this.size--;
    }


    // main interface
    public void insertNode(T data,int index){
        if (index==0){

            if getHead() == null{
              this.setHead(data);
            }
            Node<T> temp = new Node(data);
            temp.setNext(head.getNext());
            setHead(temp);

        }else if( index<0 ||index >=this.size()){
            System.out.println(">> invalid index : out of bounds ")
        }else{

                Node<T> firstTracker = getHead();
                Node<T> secondTracker = firstTracker.getNext();

                for(int _=0;_<index;_++){
                    firstTracker = secondTracker;
                    secondTracker = secondTracker.getNext();
                }

                if (secondTracker == null){

                }

                tracker.setNext(new Node(data));
                incrementSize();
        }

    }

    public void addNode(T data){
        Node<T> tracker = getHead();

        while tracker.getNext() != null{
            tracker = tracker.getNext();
        }

        tracker.setNext(new Node(data));
        incrementSize();

    }

    public T getNode(int index){

    }

    public void setNode(T data,int index){

    }

    public T removeNode(int index){

    }



}
