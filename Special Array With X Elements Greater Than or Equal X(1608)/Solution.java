class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        
        for (int x = 1; x <= n; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            
            if (count == x) {
                return x;
            }
        }
        
        return -1;
    }
     public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {3, 5, 0, 0, 6, 3, 4};
        int result = solution.specialArray(nums);
        
        System.out.println("The result is: " + result);
    }
}
