package tree;

public class InverTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode invertTree(TreeNode root) {
        return inverting(root);
    }

    private TreeNode inverting(TreeNode node){
        if(node == null){
            return node;
        }

        TreeNode temp = invertTree(node.left);
        node.left = invertTree(node.right);
        node.right = temp;
        return node;

    }


}
