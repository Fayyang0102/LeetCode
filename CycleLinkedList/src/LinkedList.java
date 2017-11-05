/**
 * Created by FAY on 2/6/17.
 */
public class LinkedList {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
/* 
 linked list 1->2->3->4->null   for cycle 4->1
 to check cycle:
 1. head & head.next cannot be null
 2. should have a loop so fast & fast.next cannot be null
 */
    
    public boolean hasCycle(Node head) {


        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(slow != fast){
            if(fast == null){
                return false;
            }
            if(fast.next == null){
                return false;
            }
            slow = head.next;
            fast = head.next.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next = new Node(3);

        System.out.println("Given Linked List :");
       // list.printList(head);
        System.out.println("");
    }

}
