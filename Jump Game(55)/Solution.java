class Solution {
    public boolean canJump(int[] nums) {
        int stepleft = nums[0];
        for (int i = 1; i < nums.length; i++) {
            stepleft--;
            if (stepleft < 0) {
                return false;
            }
            if (i == nums.length - 1) {  
                return true;
            }
            if (stepleft < nums[i]) {
                stepleft = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1));        

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2)); 
    }
}
