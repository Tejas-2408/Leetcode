package linkedlist;

// https://leetcode.com/problems/rotate-list/description/?envType=problem-list-v2&envId=linked-list

public class RotateList {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k){
        if( k <= 0 || head == null || head.next == null){
            return head;
        }
        int length = 1;
        ListNode last = head;
        while(last.next != null){
            length++;
            last = last.next;
        }

        last.next = head;
        int rotations = k%length;
        int skip = length - rotations;
        ListNode newLast = head;
        for(int i = 0; i < skip - 1; i++){
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
