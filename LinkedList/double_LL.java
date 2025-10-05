class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }   
}
public class double_LL{
    Node head=null;
    Node tail=null;
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void inert_at_start(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    public void insert_at_index(int index,int data){
        Node newnode=new Node(data);
        if(index==0){
            inert_at_start(data);
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        newnode.next=current.next;
        if(current.next!=null){
            current.next.prev=newnode;
        }
        current.next=newnode;
        newnode.prev=current;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" <-> ");
            current=current.next;

        }
        
        System.out.println("null");
        
        }
        public void display_reverse(){
        Node current=tail;
        while(current!=null){
            System.out.print(current.data+" <-> ");
            current=current.prev;
        }   
        System.out.println("null");
    }
    public static void main(String[] args) {
        double_LL list=new double_LL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);        
        list.display();
        list.inert_at_start(5);
        list.display();
        list.insert_at_index(2, 15);
        list.display();
        list.display_reverse();
    }
}

