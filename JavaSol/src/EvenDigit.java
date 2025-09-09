// Leetcode question
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigit {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {12,345,2,6,7896};

        // Count number of digits
//        for(int i:arr){
//            if(isEven(i)) count++;
//        }

        // by changing element to String and count length
//        for(int i : arr){
//            if(isEven(i)) count++;
//        }

        // check if digit lies between numbers
        for(int i: arr){
            if(checkRange(i)) count++;
        }
        System.out.println(count);
    }

    static boolean checkRange(int n){
        return ((n>9 && n<100) || (n>999 && n<10000) || n==100000);
    }

    static boolean isEven(int n){
//        int numberOfDigit = digit(n);
//        return numberOfDigit%2==0;

        int stringLength = stringLength(n);
        return stringLength%2==0;
    }

    static int stringLength(int n){
        String s = String.valueOf(n);
        return s.length();
    }
    static int digit(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}
