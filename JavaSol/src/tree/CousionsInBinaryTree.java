package tree;

// https://leetcode.com/problems/cousins-in-binary-tree/description/?envType=problem-list-v2&envId=tree

import java.util.ArrayDeque;
import java.util.Queue;

public class CousionsInBinaryTree {
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

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xNode = findNode(root,x);
        TreeNode yNode = findNode(root,y);
        
        return (
                (level(root,xNode,0) == level(root,yNode,0)) && (!isSibiling(root,xNode,yNode))
                );
    }

    private boolean isSibiling(TreeNode node, TreeNode xNode, TreeNode yNode) {
        if(node == null){
            return false;
        }

        return (node.left == xNode && node.right == yNode) || (node.left == yNode && node.right == xNode) ||
                isSibiling(node.left,xNode,yNode) || isSibiling(node.right,xNode,yNode);
    }

    private int level(TreeNode node, TreeNode x, int level) {
        if(node == null){
            return 0;
        }

        if(node == x){
            return level;
        }

        int l = level(node.left,x,level+1);
        if(l != 0){
            return l;
        }

        return level(node.right,x,level+1);
    }

    private TreeNode findNode(TreeNode node, int x) {
       if(node == null){
           return null;
       }

       if(node.val == x){
           return node;
       }

       TreeNode n = findNode(node.left,x);
       if(n != null){
           return n;
       }

       return findNode(node.right,x);
    }
}
