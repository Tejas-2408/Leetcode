package tree;

public class countNodes {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
