package array;

// https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static public int findMaxConsecutiveOnes(int[] nums){
        int maxlen = 0;
        int currMax = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1){
                currMax++;
            }
            else{
                maxlen = Math.max(maxlen,currMax);
                currMax = 0;
            }
        }

        if(currMax > maxlen){
            return currMax;
        }

        return maxlen;
    }
}
