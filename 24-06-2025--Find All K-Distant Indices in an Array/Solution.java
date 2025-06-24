import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> temp = new HashSet<>(); //avoid duplication

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=key){
                continue;
            }

            int keyindex=i;
            int start= Math.max(0, keyindex-k); //lower bound
            int end=Math.min(nums.length-1,keyindex+k);

            for(int j=start;j<=end;j++){
                temp.add(j);
            }
        }

        List<Integer> res = new ArrayList<>(temp);
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] nums = {222,151,842,244,103,736,219,432,565,216,36,198,10,367,778,111,307,460,
                      92,622,750,36,559,983,782,432,312,111,676,179,44,86,766,371,746,905,850,
                      170,892,80,449,932,295,875,259,556,730,441,153,869};
        int key = 153;
        int k = 19;

        List<Integer> result = sol.findKDistantIndices(nums, key, k);
        System.out.println("K-distant indices: " + result);
    }
}