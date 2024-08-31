import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        int k = 0;
        int j = 0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> en = iterator.next();
            if (en.getValue() != null && j < en.getValue()) {
                j = en.getValue();
                k = en.getKey();
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = solution.majorityElement(nums);
        
        System.out.println("The majority element is: " + majorityElement);
    }
}
