import java.util.Arrays;

public class Solution {
    public int maxDifference(String s, int k) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == j) continue;

                char ai = (char) ('0' + i), bj = (char) ('0' + j);
                int[] minDiff = new int[4];
                Arrays.fill(minDiff, Integer.MAX_VALUE / 2);

                int cntA = 0, cntB = 0, prevA = 0, prevB = 0, left = -1;

                for (int right = 0; right < n; right++) {
                    if (s.charAt(right) == ai) cntA++;
                    if (s.charAt(right) == bj) cntB++;

                    while ((right - left) >= k && (cntB - prevB) >= 1) {
                        int status = ((prevA & 1) << 1) | (prevB & 1);
                        minDiff[status] = Math.min(minDiff[status], prevA - prevB);

                        left++;
                        if (s.charAt(left) == ai) prevA++;
                        if (s.charAt(left) == bj) prevB++;
                    }

                    int curStatus = ((cntA & 1) << 1) | (cntB & 1);
                    int flippedStatus = curStatus ^ 0b10;

                    if (minDiff[flippedStatus] < Integer.MAX_VALUE / 2) {
                        ans = Math.max(ans, (cntA - cntB) - minDiff[flippedStatus]);
                    }
                }
            }
        }

        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "2421";
        int k1 = 1;
        System.out.println("Output for s = \"" + s1 + "\", k = " + k1 + ": " + sol.maxDifference(s1, k1)); 
        int k2 = 2;
        String s2 = "12213441";
        System.out.println("Output for s = \"" + s2 + "\", k = " + k2 + ": " + sol.maxDifference(s2, k2));
    }
}
