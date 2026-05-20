import java.util.Arrays;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int[] ans = new int[n];

        long maskA = 0;
        long maskB = 0;

        for (int i = 0; i < n; i++) {

            // set bit for A[i]
            maskA |= (1L << A[i]);

            // set bit for B[i]
            maskB |= (1L << B[i]);

            // common elements
            long commonMask = maskA & maskB;

            // count set bits
            ans[i] = Long.bitCount(commonMask);
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        int[] result = sol.findThePrefixCommonArray(A, B);

        System.out.println("Prefix Common Array: " + Arrays.toString(result));
    }
}