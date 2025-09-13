package binary.search;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=binary-search

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }

    static public int findMin(int[] nums){
        int pivotIndex = findPivot(nums);

        if(pivotIndex == -1){
            return nums[0];
        }

        return nums[pivotIndex+1];
    }

    static public int findPivot(int[] arr){
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start]>=arr[mid]){
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
