public class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                char temp = s.charAt(i);
                str = str + Character.toLowerCase(temp);
            }
        }
        int j = 0;
        int k = str.length() - 1;
        while (j < k) {
            if (str.charAt(j) != str.charAt(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Test 1: " + solution.isPalindrome(test1)); 
        System.out.println("Test 2: " + solution.isPalindrome(test2)); 
        System.out.println("Test 3: " + solution.isPalindrome(test3)); 
    }
}
