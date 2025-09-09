package binary.search;

// https://leetcode.com/problems/find-in-mountain-array/description/

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int peakIndex = peakSearch(arr);
        int firstTry = binearSearch(arr,target,0,peakIndex);
        if(firstTry!=-1)
            return firstTry;
        return binearSearch(arr,target,peakIndex+1,arr.length-1);

    }

    static int peakSearch(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }

        return start;
    }

    static int binearSearch(int[] arr,int target,int start, int end){
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;  // using this to avoid any memory exceeding condition

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(target>arr[mid]) start = mid+1;
                else end = mid-1;
            }

            else{
                if(target>arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }

        return -1;
    }
}
