package linkedlist;

// https://leetcode.com/problems/reorder-list/description/?envType=problem-list-v2&envId=linked-list

import java.util.List;

public class ReorderLL {
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = getMid(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf != null){
            hf.next = null;
        }

    }

    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }

    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
