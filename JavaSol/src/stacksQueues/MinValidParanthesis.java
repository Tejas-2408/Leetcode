package stacksQueues;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=problem-list-v2&envId=stack

import java.util.Stack;

public class MinValidParanthesis {
    public static void main(String[] args) {

    }

    static public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }

            else{
                st.push(ch);
            }
        }

        return st.size();

    }
}
