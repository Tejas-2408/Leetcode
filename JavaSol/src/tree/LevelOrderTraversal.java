package tree;

// https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=problem-list-v2&envId=tree

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
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
            ans.add(currentLevelList);
        }
        return ans;

    }


}
