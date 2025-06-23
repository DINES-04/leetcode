class Solution {

    // Create a palindrome number in base 10
    long createPalindrome(long num, boolean odd) {
        long x = num;
        if (odd) x /= 10;
        while (x > 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }

    // Check if a number is palindrome in a given base
    boolean isPalindrome(long num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append((char) (num % base + '0'));
            num /= base;
        }
        String s = sb.toString();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // Find the sum of the first n k-mirror numbers
    public long kMirror(int k, int n) {
        long sum = 0;
        for (long len = 1; n > 0; len *= 10) {
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, true);
                if (isPalindrome(p, k)) {
                    sum += p;
                    n--;
                }
            }
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, false);
                if (isPalindrome(p, k)) {
                    sum += p;
                    n--;
                }
            }
        }
        return sum;
    }

    // Main function to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 2; // base
        int n = 5; // number of k-mirror numbers to find
        long result = sol.kMirror(k, n);
        System.out.println("Sum of first " + n + " " + k + "-mirror numbers: " + result);
    }
}
