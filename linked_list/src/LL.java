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

    // ------------------                       FOR DELETION  ------------------------   -------- ---
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void deleteindex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }

        Node prev = get(index-1);
        prev.next = prev.next.next;
        size--;
    }


    public void deleteLast(){
        if(size<= 1){
            deleteFirst();
        }
       Node  node  = get(size-2);
        /*   can also be used
        for(int i=0;i<size-1;i++){
            node = node.next;
        }
        /*
         */
        int val = tail.value;
        tail = node;
        tail.next = null;


    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node  = node.next;
        }
        return node;
    }




//---------------   ----------------================  Display =============== ---------------
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
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
