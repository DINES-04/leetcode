import java.util.*;

class Solution {

    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>(); // grouped string
        int n = s.length();
        int curr = 0; // starting index of each group
        // split string
        while (curr < n) {
            int end = Math.min(curr + k, n);
            res.add(s.substring(curr, end));
            curr += k;
        }
        // try to fill in the last group
        String last = res.get(res.size() - 1);
        if (last.length() < k) {
            last += String.valueOf(fill).repeat(k - last.length());
            res.set(res.size() - 1, last);
        }
        return res.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "abcdefg";
        int k = 3;
        char fill = 'x';

        String[] result = sol.divideString(s, k, fill);

        System.out.println("Resulting groups:");
        for (String str : result) {
            System.out.println(str);
        }
    }
}