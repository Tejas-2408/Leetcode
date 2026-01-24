package linkedlist;

// https://leetcode.com/problems/palindrome-linked-list/?envType=problem-list-v2&envId=linked-list

public class PalindromeLL {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head){
        ListNode mid = getMid(head);
        ListNode rev = reverse(mid);
        ListNode s = head;
        ListNode f = rev;
        while(s != mid && f != null){
            if(s.val != f.val){
                return false;
            }
            s = s.next;
            f = f.next;
        }

        return false;
    }

    private ListNode reverse(ListNode head){
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

    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast.next != null && fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
