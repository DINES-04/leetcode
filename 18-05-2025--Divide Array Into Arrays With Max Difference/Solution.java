import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        List<int[]> res = new ArrayList<>();
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]-nums[i-2]>k){
                return new int[0][0];
            }
            res.add( new int[]{nums[i-2],nums[i-1],nums[i]});
        }
        return res.toArray(new int[0][0]);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int[][] result = sol.divideArray(nums, k);
        for (int[] group : result) {
            System.out.println(Arrays.toString(group));
        }
    }
}