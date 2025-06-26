class Solution {
    public int longestSubsequence(String s, int k) {
        // int count=1;
        // if(s.length()<k){
        //     return s.length();
        // }
        // for(int i=0;i<s.length();i++){
        //     if('0' ==s.charAt(i)){
        //         count++;
        //     }
        // }
        // return count;

        int count=0;
        long value=0;
        int power=0;

        for(int i=s.length()-1;i>=0;i--){ //start from right to left due to power of 2 for 1 in string
            if(s.charAt(i)=='0'){
                // include all 0
                count++;
            }else{
                // include 1 withon k
                if(power<32){
                    long add= 1L <<power;
                    if(value+add <=k){
                        value+=add;
                        count++;
                    }
                }
            }
            power++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "1001010";  // Example binary string
        int k = 5;             // Max allowed value

        int result = sol.longestSubsequence(s, k);
        System.out.println("Longest subsequence with value <= " + k + ": " + result);
    }
}