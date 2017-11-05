/**
 * Created by FAY on 1/31/17.
 */
public class LinkedList {

    Node head; // head of linked list

    /* Linked list node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    void printMiddle()
    {
        Node slow = head;
        Node fast = head;
        if (head != null)
        {
            while (fast!= null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("The middle element is [" +
                    slow.data + "] \n");
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
        new_node.next = head;

		/* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function prints contents of linked list
    starting from the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        for (int i=5; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}
