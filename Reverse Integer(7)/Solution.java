class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int d = x % 10;
            x = x / 10;
            
            // Checking for overflow before multiplying and adding
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0; // Overflow condition for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0; // Overflow condition for negative numbers
            }
            
            rev = rev * 10 + d;
        }
        return rev;
    }    
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int num1 = 123;
        int num2 = 1534236469;  
        System.out.println("Reverse of " + num1 + " is: " + solution.reverse(num1));  // Expected: 321
	System.out.println("Reverse of " + num2 + " is: " + solution.reverse(num2));  // Expected: 0
     }
}
