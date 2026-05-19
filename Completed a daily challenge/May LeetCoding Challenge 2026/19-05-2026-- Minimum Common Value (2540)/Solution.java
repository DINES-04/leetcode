class Solution {

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums2[j];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 6};
        int[] nums2 = {2, 3, 4, 5};

        Solution sol = new Solution();

        int result = sol.getCommon(nums1, nums2);

        System.out.println("Smallest Common Element: " + result);
    }
}