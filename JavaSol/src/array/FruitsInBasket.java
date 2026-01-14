package array;

// https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashSet;
import java.util.Set;

public class FruitsInBasket {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(totalFruit(arr));
    }

    // brute force checking each possible subarray
    public static int totalFruit(int[] fruits){
        int maxLen = 0;

        for (int i = 0; i < fruits.length; i++) {
            Set<Integer> st = new HashSet<>();
            for(int j = i; j < fruits.length; j++){
                st.add(fruits[j]);
                if(st.size() <= 2){
                    maxLen = Math.max(maxLen, j-i+1);
                }
                else{
                    break;
                }
            }

        }

        return maxLen;
    }
}
