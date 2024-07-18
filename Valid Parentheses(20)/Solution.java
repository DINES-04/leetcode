import java.util.*;
class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int len= s.length();
        for(int i=0;i<len;i++){
            char ch= s.charAt(i);
            if(ch==')' || ch=='}' || ch==']'){
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the String:");
	String str= sc.next();
	Boolean res=isValid(str);
	System.out.println(res);
    }
}