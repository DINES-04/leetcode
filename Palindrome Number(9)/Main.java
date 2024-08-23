class Solution {
    public static boolean isPalindrome(int x) {
        int n=x;
        if(x<0)
        {
            return false;
        }
        else
        {
            int last=0;
            while(x>0)
            {
                int a=x%10;
                last=last*10+a;
                x=x/10;
            }
            if(last==n)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] testCases = {121, -121, 10, 12321, 0, 1221};
        
        for (int x : testCases) {
            boolean result = solution.isPalindrome(x);
            System.out.println("Is " + x + " a palindrome? " + result);
        }
    }
}
