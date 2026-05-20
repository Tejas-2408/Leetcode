package tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    private class TreeNode{
        private int value;
        private TreeNode left;
        private TreeNode right;
    }

    public static void main(String[] args) {

    }

    public void preOrder(TreeNode node, List<Integer> ls){
        if(node == null){
            return;
        }

        ls.add(node.value);
        preOrder(node.left,ls);
        preOrder(node.right,ls);
    }
}
