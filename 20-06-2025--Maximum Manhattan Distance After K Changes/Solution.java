import java.util.*;
class Solution {
    public int maxDistance(String str, int k) {
        int maxdiff=0;
        int n=0, s=0, e=0,w=0;

        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'N':
                    n++;
                    break;
                case 'S':
                    s++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'W':
                    w++;
                    break;
            }
            int times1= Math.min(Math.min(n,s),k);  //modification time for n ans s
            int times2= Math.min(Math.min(e,w),k-times1); //modification time for e and w

            maxdiff= Math.max(maxdiff, dist(n,s,times1)+ dist(e,w,times2));
        }
        return maxdiff;
    }
    public static int dist(int dir1, int dir2, int times){
        return Math.abs(dir1-dir2)+times*2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str = "NWSE";
        int k = 1;
        int result = sol.maxDistance(str, k);
        System.out.println("Maximum Manhattan distance after " + k + " changes: " + result);
    }
}