package tree;

// https://leetcode.com/problems/diameter-of-binary-tree/description/?envType=problem-list-v2&envId=tree

public class DiameterOfTree {
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

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter - 1;

    }

    private int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        diameter = Math.max(leftHeight + rightHeight + 1, diameter);

        return Math.max(leftHeight, rightHeight) + 1; // calculating height of current node
    }
}
