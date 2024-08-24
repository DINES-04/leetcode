class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int index = haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index of 'll' in 'hello': " + solution.strStr(haystack1, needle1)); // Output: 2

    }
}
