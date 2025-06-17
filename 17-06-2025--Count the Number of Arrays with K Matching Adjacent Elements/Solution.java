class Solution {
    // Modulo for all calculations
    int mod = 1_000_000_007;

    // Arrays to store factorials and modular inverses
    static long[] revs = new long[100001]; // Not used in this version
    static int[] f = new int[100001];      // Factorials

    // Main function to count good arrays
    public int countGoodArrays(int n, int m, int k) {
        // Base case: factorial[0] = 1
        if (f[0] == 0)
            f[0] = 1;

        // Formula:
        // m               --> choose value for the first element
        // pow(m-1, n-1-k) --> number of ways to keep same value (for n-1-k positions)
        // C(n-1, n-1-k)   --> choose positions to remain the same among (n-1)
        long res = m * pow(m - 1, n - 1 - k) % mod * C(n - 1, n - 1 - k) % mod;
        
        return (int) res;
    }

    // Fast exponentiation: computes (a^b) % mod
    public long pow(int a, int b) {
        long res = 1;
        long base = a;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * base % mod;
            base = base * base % mod;
            b /= 2;
        }
        return res;
    }

    // Computes nCr % mod using factorial and modular inverse
    public long C(int a, int b) {
        return (long) getF(a) * rev(getF(a - b)) % mod * rev(getF(b)) % mod;
    }

    // Computes factorial with memoization: f[a] = a!
    public long getF(int a) {
        if (f[a] != 0)
            return f[a];
        return f[a] = (int) (getF(a - 1) * a % mod);
    }

    // Modular inverse using Fermat's Little Theorem: a^(-1) ≡ a^(mod - 2)
    public long rev(long a) {
        if (a == 1)
            return a;
        return mod - mod / a * rev(mod % a) % mod;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int n1 = 3, m1 = 2, k1 = 1; // Expected: 4
        int n2 = 5, m2 = 3, k2 = 2; // Expected: 90
        int n3 = 4, m3 = 5, k3 = 0; // Expected: 625

        System.out.println("Count of good arrays for (n1, m1, k1): " + sol.countGoodArrays(n1, m1, k1));
        System.out.println("Count of good arrays for (n2, m2, k2): " + sol.countGoodArrays(n2, m2, k2));
        System.out.println("Count of good arrays for (n3, m3, k3): " + sol.countGoodArrays(n3, m3, k3));
    }
}