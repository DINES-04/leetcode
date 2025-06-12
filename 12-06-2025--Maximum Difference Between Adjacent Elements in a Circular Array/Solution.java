class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxdis=-1;
        for(int i=0;i<nums.length-1;i++){
            maxdis=Math.max(maxdis,Math.abs(nums[i]-nums[i+1]));
        }
        maxdis=Math.max(maxdis,Math.abs(nums[nums.length-1]-nums[0])); //circular

        return maxdis;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {5, 3, 9, 2};  // Example input
        int result = sol.maxAdjacentDistance(nums);

        System.out.println("Maximum adjacent distance (circular): " + result);
    }
}