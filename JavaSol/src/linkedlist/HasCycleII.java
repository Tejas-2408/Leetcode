package linkedlist;

// https://leetcode.com/problems/linked-list-cycle-ii/description/?envType=problem-list-v2&envId=linked-list

public class HasCycleII {
    public static void main(String[] args) {

    }

    public static int lengthOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }

        return 0;
    }

    public static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length = lengthOfCycle(slow);
                break;
            }
        }

        ListNode f = head;
        ListNode s = head;

        // setting s in the cycle
        while(length > 0){
            s = s.next;
            length--;
        }

        // keep moving forward till both meet
        while(f != s){
            f = f.next;
            s = s.next;
        }

        return f;
    }
}
