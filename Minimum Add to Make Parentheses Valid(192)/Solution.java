import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int count=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else if(s.charAt(i)==')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(')');
                }
            }
        }
        return st.size();
    }
     public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "())";
        String s2 = "(((";
        System.out.println("Minimum additions for \"" + s1 + "\": " + solution.minAddToMakeValid(s1));  
        System.out.println("Minimum additions for \"" + s2 + "\": " + solution.minAddToMakeValid(s2)); 
   }
}