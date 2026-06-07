package tree;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/?envType=problem-list-v2&envId=tree

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTToLL {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
//        preOrderTraversal(root, queue);  // brute force

        while (queue.size() > 1) {
            TreeNode curr = queue.poll();
            TreeNode next = queue.peek();
            curr.left  = null;
            curr.right = next;
        }
    }

    private void optimalSol(TreeNode node){
        if(node == null){
            return;
        }

        // find the right most empty node in left tree
        TreeNode curr = node;
        if(curr.left != null){
            TreeNode rightMost = curr.left;
            while(rightMost.right != null){
                rightMost = rightMost.right;
            }

            // Attach right subtree to rightmost node of left subtree
            rightMost.right = curr.right;

            // change left subtree to right side
            curr.right = curr.left;
            curr.left = null;
        }
        optimalSol(node.right);
    }

    private void preOrderTraversal(TreeNode node,Queue<TreeNode> queue){
        if(node == null){
            return;
        }

        queue.add(node);
        preOrderTraversal(node.left,queue);
        preOrderTraversal(node.right,queue);
    }
}
