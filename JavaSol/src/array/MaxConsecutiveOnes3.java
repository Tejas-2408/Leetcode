package array;

// https://leetcode.com/problems/max-consecutive-ones-iii/description/

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
        System.out.println(longestOnesOptimised(nums,k));
    }

    // O(n)
    public static int longestOnesOptimised(int[] nums, int k){
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int zeros = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                zeros++;
            }

            if(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }

            if(zeros <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }

            r++;
        }
        return maxLen;
    }

    // O(NlogN) complexity
    public static int longestOnes(int[] nums, int k){
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int zeros = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }

            if(zeros <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }

            r++;
        }
        return maxLen;
    }
}
