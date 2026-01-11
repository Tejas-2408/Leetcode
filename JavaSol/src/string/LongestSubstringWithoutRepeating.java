package string;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s){
        int[] lastIndex = new int[256]; // stores last index + 1 of character
        Arrays.fill(lastIndex, -1);

        int maxLen = 0;
        int start = 0; // window start

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // if this character was seen within the current window
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }

            lastIndex[c] = end; // update last seen index
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
