package recursion;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        System.out.println(combo("","23"));
    }

    static ArrayList<String> combo(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        String chars = "";
        switch (digit) {
            case 2: chars = "abc"; break;
            case 3: chars = "def"; break;
            case 4: chars = "ghi"; break;
            case 5: chars = "jkl"; break;
            case 6: chars = "mno"; break;
            case 7: chars = "pqrs"; break;
            case 8: chars = "tuv"; break;
            case 9: chars = "wxyz"; break;
            default: chars = ""; // for 0 or 1
        }

        for(int i = 0; i < chars.length();i++){
            char ch = chars.charAt(i);
            ans.addAll(combo(p+ch,up.substring(1)));
        }

        return ans;
    }
}
