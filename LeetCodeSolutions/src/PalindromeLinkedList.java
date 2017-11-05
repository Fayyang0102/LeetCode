import java.util.LinkedList;

/**
 * 回文
 * Given a singly linked list, determine if it is a palindrome.
 * Created by qihuiyang on 7/23/17.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // first find mid point
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // find the point to brake and reverse
        if(fast != null){
            slow = slow.next;
        }
        slow = reverse(slow);
        //assign fast to the head of second half
        fast = head;
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public  static void main(String[] args){
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(1);
        ListNode h3 = new ListNode(2);
        ListNode h4 = new ListNode(3);

        h1.val = 1;
        h2.val = 3;
        h3.val = 3;
        h4.val = 2;

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;



        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean res = palindromeLinkedList.isPalindrome(h1);
        System.out.print(res);
    }
}
