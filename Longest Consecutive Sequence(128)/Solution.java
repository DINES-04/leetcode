import java.util.*;
class Solution {
    // o(nlogn) - sort
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                int count=1;
                int num=nums[i];
                while(hs.contains(num+1)){
                    num++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, -1, 1, 2, -2, 3, 4};
        
        System.out.println("Longest consecutive sequence length (Test case 1): " + solution.longestConsecutive(nums1));         
	System.out.println("Longest consecutive sequence length (Test case 2): " + solution.longestConsecutive(nums2)); 
    }
}
