package binary.search;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums,int target){
        int pivotIndex = pivotIndex(nums);

        // If pivotIndex = -1, array is simple sorted and run normal binary search
        if(pivotIndex==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(nums[pivotIndex]==target)
            return pivotIndex;
        else if(nums[0]<=target)
            return binarySearch(nums,target,0,pivotIndex-1);
        else
            return binarySearch(nums,target,pivotIndex+1,nums.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

    static int pivotIndex(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
                return mid;

            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[start]>=arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }

        return -1;
    }
}
