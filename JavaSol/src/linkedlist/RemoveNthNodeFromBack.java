package linkedlist;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=linked-list

public class RemoveNthNodeFromBack {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null){
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        if(length == n){
            return head.next;
        }

        ListNode prevNode = null;
        ListNode nodeDeleted = head;
        for(int i = 0; i < length - n; i++){
            prevNode = nodeDeleted;
            nodeDeleted = nodeDeleted.next;
        }

        prevNode.next = nodeDeleted.next;
        return head;
    }
}
