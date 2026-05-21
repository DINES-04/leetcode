import java.util.*;

public class Solution {
    public int digits(int x) {
        int cnt = 0;
        while(x > 0) {
            cnt++;
            x /= 10;
        }
        return cnt;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixes = new HashSet<>();

        // storing all prefixes of arr1
        for(int num : arr1) {
            int x = num;
            while(x > 0) {
                prefixes.add(x);
                x /= 10;
            }
        }

        int ans = 0;

        // check prefixes of arr2 numbers
        for(int num : arr2) {
            int x = num;
            int len = digits(num);

            // checking from larger => smaller
            while(x > 0) {
                if(prefixes.contains(x)) {
                    ans = Math.max(ans, len);
                    break;
                }

                x /= 10;
                len--;
            }
        }

        return ans;
    }

    // Main Method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};

        int result = sol.longestCommonPrefix(arr1, arr2);

        System.out.println("Longest Common Prefix Length: " + result);
    }
}