import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        List<Integer> res = new ArrayList<>();
        int k=nums.length/3;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>k){
                res.add(entry.getKey());
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 3};  // Example input

        List<Integer> result = sol.majorityElement(nums);

        System.out.println("Majority elements (> n/3 times): " + result);
    }
}