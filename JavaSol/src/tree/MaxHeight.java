package tree;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=tree

public class MaxHeight {

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

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

}
