class Solution {
    public static long count_dis(long prefix, int n){
        long count=0, curr=prefix, next= prefix+1;
        while(curr<=n){
            count+=Math.min((long)n+1, next) - curr;
            curr*=10;
            next*=10;
        }
        return count;
    }
    public int findKthNumber(int n, int k) {
        int start=1; //starting number from 1 end to 9;
        k=k-1;
        while(k>0){   //check the k
            long cnt= count_dis(start,n);  //distance from 1-9  for every 1-9 
            //for example: take 1: disance 11 (1)(10-19) total 11 under condition n 
            if(cnt<=k){ 
                start++;
                k-=cnt;
            }else{
                start*=10;
                k--;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 100;
        int k = 10;

        int kthNumber = sol.findKthNumber(n, k);
        System.out.println("The " + k + "-th number in lexicographical order from 1 to " + n + " is: " + kthNumber);
    }
}