import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm= new HashMap<>();
        HashMap<Character,Character> hp= new HashMap<>();
        int lens=s.length();
        int lent=s.length();
        for(int i=0;i<lens;i++){
            if(hm.containsKey(s.charAt(i)))
            {
                if(t.charAt(i)!=hm.get(s.charAt(i))){
                    return false;
                }
            }
            else
            {   
                if(hp.containsKey(t.charAt(i))){
                    return false;  //when s character does not contain character but, t character contain then return false; because both are not same..
                }
                hm.put(s.charAt(i),t.charAt(i));
                hp.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "badc";
        String t = "baba";
        boolean result = solution.isIsomorphic(s, t);
        System.out.println("Are the strings isomorphic? " + result); 
    }
}