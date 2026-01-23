package linkedlist;

// https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list

public class MiddelOfLL {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
