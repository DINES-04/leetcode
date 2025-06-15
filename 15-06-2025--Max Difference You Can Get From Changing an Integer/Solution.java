class Solution {
    public int maxDiff(int num) {
        String str= String.valueOf(num);
        // max
        char max_char=' ';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='9'){
                max_char=str.charAt(i);
                break;
            }
        }
        String max=(max_char == ' ') ? str : str.replace(max_char, '9');

        // min
        char min_char=' ';
        String min="";
        if(str.charAt(0)!='1'){
            min_char=str.charAt(0);
            min=str.replace(min_char, '1');
        }else{
            for(int i=1;i<str.length();i++){
                System.out.println(str.charAt(i));
                if(str.charAt(i)!='0' && str.charAt(i)!=str.charAt(0)){
                    min_char=str.charAt(i);
                    break;
                }
            }
            System.out.println(min_char);
            min=str.replace(min_char, '0');
        }
        
        // string to int
        int maxs=Integer.parseInt(max);
        int mins=Integer.parseInt(min);

        return maxs-mins; 
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int num1 = 11891;
        int num2 = 90;
        int num3 = 99999;
        int num4 = 10001;

        System.out.println("Difference for " + num1 + ": " + sol.maxDiff(num1)); // Expected: 99009
        System.out.println("Difference for " + num2 + ": " + sol.maxDiff(num2)); // Expected: 81
        System.out.println("Difference for " + num3 + ": " + sol.maxDiff(num3)); // Expected: 99999 - 0 = 99999
        System.out.println("Difference for " + num4 + ": " + sol.maxDiff(num4)); // Check manually
    }
}