package tree;

// https://leetcode.com/problems/validate-binary-search-tree/description/?envType=problem-list-v2&envId=tree

public class ValideBST {

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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }

    private boolean isValidBST(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }

        if(low != null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        return isValidBST(node.left,low,node.val) && isValidBST(node.right,node.val,high);
    }
}
