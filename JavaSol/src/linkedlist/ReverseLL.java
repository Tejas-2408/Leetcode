package linkedlist;

public class ReverseLL {
    public static void main(String[] args) {

    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }

        head = prev;
        return head;
    }
}
