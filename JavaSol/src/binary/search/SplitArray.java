package binary.search;

// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {
    public static void main(String[] args) {

    }

    static public int splitArray(int[] nums, int k){
        int start =0, end=0;
        for(int i: nums){
            start = Math.max(start,i);
            end+=i;
        }

        while(start<end){
            // tried for the middle as potential ans
            int mid = start + (end-start)/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num:nums){
                if(sum+num>mid){
                    // need to create new sub-array
                    sum = num;
                    pieces++;
                }
                else
                    sum+=num;
            }

            if(pieces>k){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }

        return end; // start == end here
    }
}
