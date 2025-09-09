// Leetcode question
// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestPerson {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5}, {7, 3}, {3, 5}
        };

        int wealth = 0;

        for (int[] i : accounts) {
            int total = sumArray(i);
            if (total > wealth) wealth = total;
        }

        System.out.println(wealth);

    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
