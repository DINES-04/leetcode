import java.util.*;
class Solution {
    public static  int lengthOfLastWord(String s) {
	int i=0;
        int j=s.length()-1;
        int count=0;
       while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }
        while(i<=j){
            char ch = s.charAt(j);
            int k= (int) ch;
            if((65<=k && k<=90) || (97<=k && k<=122)){
                j--;
                count++;
            }else{
                break;
            }
        }
        return count;  
    }
     public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the String:");
	String str= sc.next();
	int res=lengthOfLastWord(str);
	System.out.println(res);
     }
}