class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {6, 12, 18, 24};
        int[] nums2 = {2, 3};
        int k = 1;
        
        int result = solution.numberOfPairs(nums1, nums2, k);
        System.out.println("Number of pairs: " + result);
    }
}
