import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("isPalindrome = " + sol.isPalindrome(313));
        System.out.println("isPalindrome = " + sol.isPalindromeV1(313));

    }
    public boolean isPalindrome(int x) {
        String xLetter = String.valueOf(x);
        int left = 0;
        int right = xLetter.length() - 1;
        if(xLetter.length() == 1) return true;
        if(xLetter.charAt(0) == '-') return  false;
        while(left < right){
            if(xLetter.charAt(left) == xLetter.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindromeV1(int x){
        if(x < 0) return false;
        if(x < 9) return true;
        int copyX = x;
        int rem = x % 10;
        int newX = rem;
        System.out.println("rem = " + rem);
        while(x > 9){
            x = x / 10;
            rem = x % 10;
            System.out.println("rem = " + rem);
            newX = newX * 10 + rem;
        }
        System.out.println("newX = " + newX + " and x = "+ copyX);
        return newX == copyX;
    }
}

