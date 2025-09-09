package binary.search;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'p';
        System.out.println(fslgtt(arr,target));
    }

    static char fslgtt(char[] arr, char target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]<=target)
                start = mid+1;
            else
                end = mid-1;
        }

        return arr[start%arr.length];
    }
}
