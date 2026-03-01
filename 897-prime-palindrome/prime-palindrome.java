class Solution {
    public int primePalindrome(int n) {

        // Small edge cases
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // Generate only odd length palindromes
        for (int i = 1; i < 100000; i++) {

            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);

            sb.deleteCharAt(sb.length() - 1);  // avoid duplicate middle digit
            sb.reverse();

            int palindrome = Integer.parseInt(s + sb.toString());

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }

        return -1; // Guaranteed not to reach
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}