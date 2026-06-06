package tree;

// https://leetcode.com/problems/symmetric-tree/?envType=problem-list-v2&envId=tree

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CheckSymmetry {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean isSymmetric(TreeNode root) {
        return checkSymm(root.left,root.right);
    }

    private boolean checkSymm(TreeNode left, TreeNode right) {

        if (left == null || right == null) {
            return left == right;
        }

        return left.val == right.val && checkSymm(left.left,right.right) && checkSymm(left.right,right.left);
    }

    // BFS approach
    public boolean isSymmetricc(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null){
                continue;
            }

            if(left == null || right == null){
                return false;
            }

            if(left.val != right.val){
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
