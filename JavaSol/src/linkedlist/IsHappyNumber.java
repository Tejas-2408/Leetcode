package linkedlist;

// https://leetcode.com/problems/happy-number/

public class IsHappyNumber {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        }while(fast != slow);

        return slow == 1;
    }

    private int digitSquareSum(int n){
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans += rem * rem;
            n = n/10;
        }

        return ans;
    }
}
