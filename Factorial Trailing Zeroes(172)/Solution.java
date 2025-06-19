class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 100;
        int result = sol.trailingZeroes(n);
        System.out.println("Number of trailing zeroes in " + n + "! is: " + result);
    }
}