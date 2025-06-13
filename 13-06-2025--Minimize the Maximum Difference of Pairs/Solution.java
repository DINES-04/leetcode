import java.util.*;
class Solution {
    public static boolean ispossible(int[] nums, int mid, int p){
        int count=0;
        int i=1;
        while(i<nums.length){
            if(nums[i]-nums[i-1]<=mid){
                count++;
                i+=2;   //if pair is correct then skip 2 due to no index appears more than once amongst the p pairs.
            }else{
                i++; 
            }
        }
        return count>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low=0;
        int high= nums[nums.length-1];
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;//prevent overflow
            if(ispossible(nums,mid,p)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case
        int[] nums = {4, 2, 1, 2};
        int p = 1;

        int result = sol.minimizeMax(nums, p);
        System.out.println("Minimum maximum difference among " + p + " pairs: " + result);
    }
}