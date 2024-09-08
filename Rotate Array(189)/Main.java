class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
    return;
    }
    int i = nums.length;
    k = k % i; 
    reverse(nums, 0, i - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, i - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: ");
        printArray(nums);

        solution.rotate(nums, k);

        System.out.println("Array after rotation: ");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
