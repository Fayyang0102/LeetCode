/**
 * Created by FAY on 1/31/17.
 */
public class RemoveDuplicate {
    ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int value) {val = value; next = null;}
    }
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void removeDuplicate1(ListNode head) {
        if(head == null || head.next == null)
            return;

        ListNode i = head,j = head;
        while(i != null){
            while(j.next != null){
                if(i.val == j.next.val){
                    j.next = j.next.next;
                }else{
                    j = j.next;
                }
            }
            i = i.next;
        }
    }

    public static void print(ListNode head){
        System.out.println("Input number:");
        printList(head);
        removeDuplicate1(head);
        System.out.println("The result after remove the duplicate value:");
        printList(head);
    }

    /**
     * convert the input array to LinkedList, make the test more easily
     */
    private static ListNode arrayToLinkedList(int[] arr){
        if (arr == null || arr.length < 1)
            return null;

        ListNode fakeHead = new ListNode(0);
        ListNode cur = fakeHead;
        for(int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {

        ListNode test1 = arrayToLinkedList(new int[]{1, 2, 3, 3, 4, 4});
        print(test1);

        ListNode test2 = arrayToLinkedList(new int[]{9, 443, 1, -2, 1, 32});
        print(test2);

        ListNode test3 = arrayToLinkedList(new int[]{71, 32, 1, -32});
        print(test3);

        ListNode test4 = arrayToLinkedList(new int[]{1, 1});
        print(test4);

        ListNode test5 = arrayToLinkedList(new int[]{});
        print(test5);
    }
}
