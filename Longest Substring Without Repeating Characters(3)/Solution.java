import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // sliding window
        int start=0;
        int end=0;
        int max_length=0;
        ArrayList<Character> list= new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string:");
	String str= sc.next();
	int max =lengthOfLongestSubstring(str);
	System.out.println("longest substring: "+max);
    }
}