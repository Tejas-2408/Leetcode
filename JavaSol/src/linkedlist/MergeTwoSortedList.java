package linkedlist;

public class MergeTwoSortedList {
    public static void main(String[] args) {

    }

    public static ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode node = new ListNode();
        ListNode head = node;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            }
            else if(l2.val < l1.val){
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }
        }

        if(l1 != null){
            node.next = l1;
        }

        if(l2 != null){
            node.next = l2;
        }

        return head;
    }
}
