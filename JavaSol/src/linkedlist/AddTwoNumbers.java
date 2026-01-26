package linkedlist;

// https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=linked-list

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode newList = new ListNode(0);
        ListNode curr = newList;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
        }

        return reverse(newList.next);
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev =  null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }
}
