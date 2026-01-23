package linkedlist;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode ln = new ListNode();

    }

    public static ListNode removeDuplicates(ListNode head){
        ListNode node = head;
        while(node != null && node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
