package linkedlist;

// https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=problem-list-v2&envId=linked-list

public class ReverseLinkedListII {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right){
        if(left == right){
            return head;
        }

        // skip left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        for(int i = 0; current.next != null && i < left - 1 ; i++){
            prev = current;
            current = current.next;
        }

        ListNode lastBeforeReverse = prev;
        ListNode newEnd = current;

        // reverse the window
        ListNode next = current.next;

        for(int i = 0; current != null && i < right - left + 1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(lastBeforeReverse != null) {
            lastBeforeReverse.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;

        return head;
    }


}
