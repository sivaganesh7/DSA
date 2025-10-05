class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Basic_linkedlist {
    node head=null;
    node tail=null;
    
    public void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=tail.next;
        }
    }
    public void display(){
        node current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Basic_linkedlist list=new Basic_linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display(); 
    
}
}

