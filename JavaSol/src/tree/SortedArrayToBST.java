package tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=problem-list-v2&envId=tree

public class SortedArrayToBST {

    private class TreeNode{
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
        int[] arr = {1,2,3,4,5,6,7,8};
        sortedArrayToBST(arr);
    }

    public static TreeNode sortedArrayToBST(int[] arr) {
        return sortInsert(arr);
    }

    private static TreeNode sortInsert(int[] arr) {
        return sortedInsertArray(arr,0,arr.length);
    }

    private static TreeNode sortedInsertArray(int[] arr, int s, int e) {
        if(s>=e){
            return null;
        }

        int m = (s+e)/2;
        insert(arr[m]);
        sortedInsertArray(arr,s,m);
        sortedInsertArray(arr,m+1,e);
    }


}
