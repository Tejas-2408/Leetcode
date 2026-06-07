package tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=problem-list-v2&envId=tree

public class SortedArrayToBST {

    static public class TreeNode {
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

    public static void main(String[] args) {
        TreeNode root = sortedArrayToBST(new int[]{1,2,3,4,5});
        display(root,"Root Node: ");

    }

    static public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    static private TreeNode build(int[] nums, int start, int end) {
        // Base case: no elements in range
        if (start > end) return null;

        // Always pick middle element as root → guarantees height balance
        int mid = start + (end - start) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        // Left subtree  → elements before mid
        node.left  = build(nums, start, mid - 1);

        // Right subtree → elements after mid
        node.right = build(nums, mid + 1, end);

        return node;
    }


    static private void display(TreeNode node, String details) {
        if(node == null){
            return;
        }

        System.out.println(details + node.val);

        display(node.left, "Left child of "+ node.val + " : ");
        display(node.right, "Right child of "+ node.val + " : ");
    }
}
