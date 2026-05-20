package tree;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=tree

import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal {

    private class Node{
        private int value;
        private Node left;
        private Node right;
    }

    public static void main(String[] args) {

    }

    public List<Integer> inOrder(Node node){
        if(node == null){
            return new ArrayList<>();
        }

        List<Integer> ls = new ArrayList<>();
        inOrder(node.left);
        ls.add(node.value);
        inOrder(node.right);

        return ls;
    }


}
