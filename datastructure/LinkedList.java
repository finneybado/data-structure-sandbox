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

            incrementSize();

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
                    fisrtTracker.setNext(new Node(data));
                }else {
                    firstTracker.setNext(new Node(data));
                    firstTracker.getNext().setNext(secondTracker);
                }

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
        if (index<0 || index>=size()){
            System.out.println(">>invalid index : out of bounds");
        }else{
            if (index == 0){
                return getHead.getData();
            }else{
                Node<T> tracker = getHead();
                for (int _==0;_<index;_++){
                    tracker = tracker.getNext();
                }

                return tracker.getData();
            }
        }

    }

    public void setNode(T data,int index){
        if (index<0 || index>=size()){
            System.out.println(">>invalid index : out of bounds");
        }else{
            if (index == 0){
                Node<T> temp = getHead();
                temp.setData(data);
            }else{
                Node<T> tracker = getHead();
                for (int _==0;_<index;_++){
                    tracker = tracker.getNext();
                }

                tracker.setData(data);
            }
        }

    }

    public T removeNode(int index){

    }

    public void display(){
        // [1]->(2)->(3)
        if (size()==0){
            System.out.println("[NIL]");
        }else if (size()==1){
            System.out.println("[" + head.getData.toString() +"]");
    }else{
        Node<T> tracker = head;
        System.out.print("[" + tracker.getData.toString() +"]");
        for (int _= 1;_<size();_++){
            tracker = tracker.getNext();
            System.out.print("->(" + tracker.getData.toString() +")");
        }
    }
    }



}
