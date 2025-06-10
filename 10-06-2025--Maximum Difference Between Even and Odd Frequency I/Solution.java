import java.util.*;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }

        int odd_max=Integer.MIN_VALUE;
        int even_max=Integer.MAX_VALUE;

        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()%2==0){
                if(entry.getValue()<even_max){
                    even_max=entry.getValue();
                }
            }else{
                if(entry.getValue()>odd_max){
                    odd_max=entry.getValue();
                }
            }
        }
        return odd_max-even_max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test cases
        String s1 = "aaaaabbc";
        String s2 = "xyzxyzxyz";
        String s3 = "aaabbbcccdddde";

        System.out.println("Max difference in \"" + s1 + "\": " + sol.maxDifference(s1));
        System.out.println("Max difference in \"" + s2 + "\": " + sol.maxDifference(s2));
        System.out.println("Max difference in \"" + s3 + "\": " + sol.maxDifference(s3));
    }
}