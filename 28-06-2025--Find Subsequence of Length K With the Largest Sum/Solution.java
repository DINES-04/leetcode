import java.util.*;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] num= nums.clone();
        Arrays.sort(num);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = num.length - k; i < num.length; i++) {
            hm.put(num[i], hm.getOrDefault(num[i], 0) + 1);
        }

        int[] res= new int[k];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) && hm.get(nums[i]) > 0) {
                res[j++] = nums[i];
                hm.put(nums[i], hm.get(nums[i]) - 1);
            }
            // if (j == k) break;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = new int[]{2,1,3,3};
        int k=2;
        int[] res= sol.maxSubsequence(arr,k);

        for(int num: res){
            System.out.print(num+" ");
        }
    }
}