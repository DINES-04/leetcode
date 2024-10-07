import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            // convert sorted string 
            char[] chararr=strs[i].toCharArray();
            Arrays.sort(chararr);
            String sortstr= new String(chararr);
            if(hm.containsKey(sortstr)){
                // first get hash key and add value
                hm.get(sortstr).add(strs[i]);
            }else{
                // initial the arraylist and put into hashmap
                ArrayList<String> arr=new ArrayList<>();
                arr.add(strs[i]);
                hm.put(sortstr,arr);
            }
        }
        // convert as list<list<String>>
        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> list : hm.values()) {
            result.add(new ArrayList<>(list));
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs);
        System.out.println(groupedAnagrams);
    }
}