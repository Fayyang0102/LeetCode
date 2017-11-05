/**
 * Created by FAY on 2/26/17.
 */
public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        tail.next = new ListNode(1);//这个顺序你可以随便改，用来test
        tail = tail.next;
        tail.next = new ListNode(6);
        tail = tail.next;
        tail.next = new ListNode(7);
        tail = tail.next;
        tail.next = new ListNode(4);
        tail = tail.next;
        tail.next = new ListNode(5);
        tail = tail.next;
        tail.next = new ListNode(2);
        tail = tail.next;
        tail.next = new ListNode(4);
        tail = tail.next;
        tail.next = new ListNode(8);
        tail = tail.next;
        tail.next = new ListNode(9);
        tail = tail.next;

        Solution s = new Solution();
        s.partition(head, 5);      //这个5你可以随便试别的

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}

    class Solution {
        /**
         * @param head: The first node of linked list.
         * @param x: an integer
         * @return: a ListNode
         */
        public ListNode partition(ListNode head, int x) {
            // write your code here
            if(head == null)
                return head;

            ListNode leftDummy = new ListNode(0);
            ListNode rightDummy = new ListNode(0);
            ListNode left = leftDummy, right = rightDummy;

            while(head!= null){
                if(head.val < x){
                    left.next = head;
                    left = head;
                }
                else{
                    right.next = head;
                    right = head;
                }
                head = head.next;
            }

            left.next = rightDummy.next;
            right.next = null;
            return leftDummy.next;
        }
    }
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }


