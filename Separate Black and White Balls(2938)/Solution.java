class Solution {
    public long minimumSteps(String s) {
        // StringBuilder sb = new StringBuilder(s);
        // long swap = 0;
        // int i = 0;
        // while (i < sb.length()) {
        //     while (i < sb.length() && sb.charAt(i) != '1') {
        //         i++;
        //     }
            
        //     if (i >= sb.length()) break; 
        //     int j = i + 1;
        //     while (j < sb.length() && sb.charAt(j) != '0') {
        //         j++;
        //     }
            
        //     if (j >= sb.length()) break; 
        //     sb.setCharAt(i, '0');
        //     sb.setCharAt(j, '1');
        //     swap++;
        //     i = j;
        // }
        
        // return swap;
        long ones=0;
        long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                sum+=ones;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "1101";
        System.out.println("Minimum steps for \"" + s1 + "\": " + solution.minimumSteps(s1));
    }
}
