class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    /*if(n==0||n==1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=2;i<=n;i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;  */
	public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + solution.fib(n));
    }
}