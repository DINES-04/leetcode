class Solution {
    public int minimumDeletions(String word, int k) {
        int n= word.length();
        int[] freq= new int[26];
        for(int i=0;i<n;i++){
            freq[word.charAt(i)-'a']++;
        }

        int max=0;
        for(int x : freq){
            max=Math.max(x,max);
        }

        int ans=n;
        // int upper=k/2 , lower=k-k/2;
        for(int L: freq){
            int del=0;
            for(int i=0;i<26;i++){
                // go through all character to find which lies within window
                if(freq[i]<L){
                    del+=freq[i];  //deleting whole bar due to below the k (lower limit)
                }else if(freq[i]>L+k){
                    del+=(freq[i]-L-k); //deleteing specific part which lies above k (upper limit)
                }
            }
            ans=Math.min(del,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String word = "aabbcc";
        int k = 2;
        int result = sol.minimumDeletions(word, k);
        System.out.println("Minimum deletions to make the string " + k + "-special: " + result);
    }
}