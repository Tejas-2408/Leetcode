package linkedlist;

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/?envType=problem-list-v2&envId=linked-list

public class DeleteNodeFromLL {
    public static void main(String[] args) {

    }
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        temp.next = null;
    }

}
