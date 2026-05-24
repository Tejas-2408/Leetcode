package tree;

// https://leetcode.com/problems/symmetric-tree/?envType=problem-list-v2&envId=tree

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
}
