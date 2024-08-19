class Solution {
    public boolean isHappy(int n) {
        while(!(n>=0 && n<=9 && n!=7)){// 7 is a happy number
            int number=n;
            n=0;
            while (number > 0) {
            int digit = number % 10;  
            int square = digit * digit;  
            n=n+square;
            number /= 10;  
         }
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
	int n=7;
	Boolean res= solution.isHappy(n);
	System.out.println("output:"+res);
   }
}