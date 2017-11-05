/**
 * Created by FAY on 2/6/17.
 */
public class LinkedList{

    static Node head;
    static class Node {
        String data;
        Node next;
        Node(String d) {
            data =  d;
            next = null;
        }
    }
    void deleteNode(Node node, Node n) {
        // When node to be deleted is head node
        if (node == n) {
            if (node.next == null) {
                System.out.println("There is only one node. The list "
                        + "can't be made empty ");
                return;
            }
			/* Copy the data of next node to head */
            node.data = node.next.data;
            // store address of next node
            n = node.next;
            // Remove the link of next node
            node.next = node.next.next;
            // free memory
            System.gc();
            return;
        }
        // When not first node, follow the normal deletion process
        // find the previous node
        Node prev = node;
        while (prev.next != null && prev.next != n) {
            prev = prev.next;
        }
        // Check if node really exists in Linked List
        if (prev.next == null) {
            System.out.println("Given node is not present in Linked List");
            return;
        }
        // Remove node from Linked List
        prev.next = prev.next.next;
        // Free memory
        System.gc();
        return;
    }
    /* Utility function to print a linked list */
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node("o");
        list.head.next = new Node("f");
        list.head.next.next = new Node("f");
        list.head.next.next.next = new Node("e");
        list.head.next.next.next.next = new Node("r");
        list.head.next.next.next.next.next = new Node("d");
        list.head.next.next.next.next.next.next = new Node("a");
        list.head.next.next.next.next.next.next.next = new Node("o");

        System.out.println("Given Linked List :");
        list.printList(head);
        System.out.println("");

        // Let us delete the node with value 10
        System.out.println("Deleting node :" + head.next.next.data);
        list.deleteNode(head, head.next.next);

        System.out.println("Modified Linked list :");
        list.printList(head);
        System.out.println("");

        // Lets delete the first node
        System.out.println("Deleting first Node");
        list.deleteNode(head, head);
        System.out.println("Modified Linked List");
        list.printList(head);

    }



}
