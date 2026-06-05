package tree;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/?envType=problem-list-v2&envId=tree

import java.util.*;

public class LevelOrderTraversalII {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            int levelSize = qu.size();
            List<Integer> currentLevelList = new ArrayList<>();
            for(int i = 0 ; i < levelSize ; i++){
                TreeNode currentNode = qu.poll();
                currentLevelList.add(currentNode.val);
                if(currentNode.left != null){
                    qu.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    qu.offer(currentNode.right);
                }
            }
            ans.addFirst(currentLevelList);
        }
        return ans;

    }
}
