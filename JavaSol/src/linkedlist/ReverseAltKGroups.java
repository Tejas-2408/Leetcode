package linkedlist;

public class ReverseAltKGroups {
    public static void main(String[] args) {

    }

    public ListNode reverseAltGroup(ListNode head, int k){
        if(k <= 1 || head == null){
            return head;
        }

        // skip left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while(true){
            ListNode lastBeforeReverse = prev;
            ListNode newEnd = current;

            // reverse the window
            ListNode next = current.next;

            for(int i = 0; current != null && i < k + 1; i++){
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

            // skip k nodes
            for(int i = 0 ; current != null && i < k; i++){
                prev = current;
                current = current.next;
        }

        return head;
    }
    }
}
