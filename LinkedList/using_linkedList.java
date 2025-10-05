import java.util.*;
public class using_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);

        ll.addFirst(5);
        ll.addLast(30); 
        ll.add(0, 2); // add at index 0
        System.out.println(ll); // [2, 5, 10, 20,
    }
}
