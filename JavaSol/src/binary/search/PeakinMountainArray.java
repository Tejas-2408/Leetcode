package binary.search;

public class PeakinMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int[] arr2 = {1,2,3,4,5,4,3,2,1};
        System.out.println(arr[peakSearch(arr)]);
        System.out.println(arr2[peakSearch(arr2)]);

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
}
