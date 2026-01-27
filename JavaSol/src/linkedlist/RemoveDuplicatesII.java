package linkedlist;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/?envType=problem-list-v2&envId=linked-list

public class RemoveDuplicatesII {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Move curr forward while next has the same value
            if (curr.next != null && curr.val == curr.next.val) {
                int dupVal = curr.val;
                while (curr != null && curr.val == dupVal) {
                    curr = curr.next;
                }
                prev.next = curr; // skip all duplicates
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
