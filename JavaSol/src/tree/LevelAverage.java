package tree;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=problem-list-v2&envId=tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverage {
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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double levelAvg = 0;
            for(int i = 0 ; i < levelSize ; i++){
                TreeNode currentNode = queue.poll();
                levelAvg += currentNode.val;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }

            levelAvg = levelAvg / levelSize;
            result.add(levelAvg);
        }

        return result;

    }
}
