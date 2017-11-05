import java.util.Map;

/**
 * Created by FAY on 2/21/17.
 */
public class LinkedList {
     Node head;
     static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static Node Merge(Node l1, Node l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        Node mergeHead;
        if(l1.data < l2.data){
            mergeHead = l1;
            mergeHead.next = Merge(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = Merge(l1, l2.next);
        }
        return mergeHead;
    }

    void printList(){
        Node newnode = this.head;
        while(newnode != null){
            System.out.print(newnode.data +" ");
            newnode = newnode.next;
        }
    }

    public  static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.head = new Node(1);
        list1.head.next = new Node(3);
        list1.head.next.next = new Node(5);
        list1.head.next.next.next = null;

        System.out.println("Given first Linked list \n" );
        list1.printList();

        list2.head= new Node(2);
        list2.head.next = new Node(4);
        list2.head.next.next = new Node(6);
        list2.head.next.next.next = null;


        System.out.println("Given second Linked list \n");
        list2.printList();
        LinkedList newlist = new LinkedList();
        newlist.Merge(list1.head, list2.head);
        System.out.print("After Merge  ");

        newlist.printList();
    }
}
