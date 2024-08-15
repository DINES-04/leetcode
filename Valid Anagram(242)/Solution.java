import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

         if (s.length() != t.length()) {
            return false; 
        }
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            // if(hm.containsKey(s.charAt(i))){
            //     int temp=hm.get(s.charAt(i));
            //     hm.put(s.charAt(i),temp+1);
            // }else{
            //     hm.put(s.charAt(i),1);
            // }
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                int temp=hm.get(t.charAt(i));
                if(temp==1){
                    hm.remove(t.charAt(i));
                }else{
                    hm.put(t.charAt(i),temp-1);
                }
            }else{
                return false;
            }
        }
        // if(hm.isEmpty()){
        //     return true;
        // }else{
        //     return false;
        // }
        return hm.isEmpty();
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is \"" + s1 + "\" an anagram of \"" + t1 + "\"? " + solution.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Is \"" + s2 + "\" an anagram of \"" + t2 + "\"? " + solution.isAnagram(s2, t2));
  }
}