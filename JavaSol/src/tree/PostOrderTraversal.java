package tree;

import java.util.List;

public class PostOrderTraversal {
    private class TreeNode{
        private int val;
        private TreeNode right;
        private TreeNode left;
    }
    public static void main(String[] args) {

    }

    private void postOrder(TreeNode node, List<Integer> ls){
        if(node == null){
            return;
        }

        postOrder(node.left,ls);
        postOrder(node.right,ls);
        ls.add(node.val);
    }
}
