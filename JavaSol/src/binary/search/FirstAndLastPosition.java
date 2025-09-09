package binary.search;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[] arr, int target){
        int[] ans = {-1,-1};
        int first = binarySearch(arr,target,true);
        int last = binarySearch(arr,target,false);
        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean firstIndex){
        int ans = -1;
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]<target)
                s = mid+1;
            else if(arr[mid]>target)
                e = mid-1;
            else{
                ans = mid;
                if(firstIndex)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }
        return ans;
    }
}
