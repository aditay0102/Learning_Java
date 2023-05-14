public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }


    //---------------------------             insert in empty linked list---------------
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    // ------------   insert at tail -------------
    public void insertLast(int val){
        // base case
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node  node = new Node(val);
        tail.next = node;
        tail = node;

        size+=1;
    }

    // ==============================================----------- insert at index-------- === === === === === == = ===
    public void insert(int val,int index){
        // base case
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node temp  = head;

        // we started from 1 becasue temp = head is 0th index
       for(int i= 1;i<index;i++){
           temp = temp.next;
       }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }


        // when next it also provided
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
