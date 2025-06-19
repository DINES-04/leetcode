import java.util.*;
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int curr=nums[0];
        int count=1; //inital form in subsquence
        for(int i=1;i<nums.length;i++){
            if(nums[i]-curr>k){
                count++;
                curr=nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 6, 7, 9};
        int k = 2;
        int result = sol.partitionArray(nums, k);
        System.out.println("Minimum number of partitions: " + result);
    }
}