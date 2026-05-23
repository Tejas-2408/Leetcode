package tree;

// https://leetcode.com/problems/search-in-a-binary-search-tree/description/?envType=problem-list-v2&envId=tree

public class SearchInBST {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        return val < root.val
                ? searchBST(root.left, val)
                : searchBST(root.right, val);


//        while (root != null) {
//
//            if (root.val == val) {
//                return root;
//            }
//
//            root = val < root.val
//                    ? root.left
//                    : root.right;
//        }
//
//        return null;

    }
}
