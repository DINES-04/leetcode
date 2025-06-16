class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }

        return maxDiff;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int[] nums1 = {7, 1, 5, 4};
        int[] nums2 = {9, 4, 3, 2};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {5, 4, 3, 2, 1};

        System.out.println("Maximum difference for nums1: " + sol.maximumDifference(nums1)); // Expected: 4
        System.out.println("Maximum difference for nums2: " + sol.maximumDifference(nums2)); // Expected: -1
        System.out.println("Maximum difference for nums3: " + sol.maximumDifference(nums3)); // Expected: 4
        System.out.println("Maximum difference for nums4: " + sol.maximumDifference(nums4)); // Expected: -1
    }
}