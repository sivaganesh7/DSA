class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Array_LL{
    node head;
    public void insert(int data){
        node n_node=new node(data);
        if(head==null){
            head=n_node;
        } 
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n_node;
        }
    }
    public void display(){
        node temp=head;
        while(temp!=null)  
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Array_LL list=new Array_LL();
        list.insert(10);
        list.insert(20);
        list.insert(30);    
        list.display();
    }
}