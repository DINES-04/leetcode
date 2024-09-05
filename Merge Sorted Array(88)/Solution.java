import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int l = m + n - 1;

        while (p >= 0 && q >= 0) {
            if (nums1[p] > nums2[q]) {
                nums1[l] = nums1[p];
                p--;
            } else {
                nums1[l] = nums2[q];
                q--;
            }
            l--;
        }

        while (q >= 0) {
            nums1[l] = nums2[q];
            q--;
            l--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};  
        int m = 3; 
        int[] nums2 = {2, 5, 6}; 
        int n = 3; 
        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
