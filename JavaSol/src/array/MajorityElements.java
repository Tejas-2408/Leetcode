package array;

// https://leetcode.com/problems/majority-element-ii/

import java.util.ArrayList;
import java.util.List;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums){
        List<Integer> majorityElements = new ArrayList<>();
        int e1 = 0;
        int e2 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i : nums){
            if(count1 > 0 && i == e1){
                count1++;
            }

            else if(count2 > 0 && i == e2){
                count2++;
            }

            else if(count1 == 0){
                e1 = i;
                count1++;
            }

            else if(count2 == 0){
                e2 = i;
                count2++;
            }

            else{
                count1--;
                count2--;
            }
        }

        int c1 = 0;
        int c2 = 0;
        for(int n :  nums){
            if(n == e1) c1++;
            else if(n == e2) c2++;
        }

        if(c1 > nums.length/3){
            majorityElements.add(e1);
        }

        if(c2 > nums.length/3){
            majorityElements.add(e2);
        }
        return majorityElements;
    }
}
