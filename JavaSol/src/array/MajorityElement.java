package array;

// https://leetcode.com/problems/majority-element/

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums){
        int num = nums[0];
        int vote = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == num){
                vote++;
            }

            else if(vote == 0){
                num = nums[i];
                vote++;
            }
            else{
                vote--;
            }
        }

        return num;
    }
}
