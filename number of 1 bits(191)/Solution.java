class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            int temp = 0;
            temp = n % 2;
            if (temp == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 11;
        int result = solution.hammingWeight(n);
        System.out.println("The Hamming Weight of " + n + " is: " + result);
    }
}
