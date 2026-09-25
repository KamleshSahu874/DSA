class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 are not palindromes,
        // except 0 itself
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {

            int digit = x % 10;

            reversedHalf = reversedHalf * 10 + digit;

            x = x / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}