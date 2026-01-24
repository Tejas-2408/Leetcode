package linkedlist;

public class MergeSort {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head){
        if(head != null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeLists(left,right);
    }

    public ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }

        if(l1 != null){
            tail.next = l1;
        }

        if(l2 != null){
            tail.next = l2;
        }

        return dummyHead.next;
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null; // 🔑 split
        }
        return slow;
    }
}
