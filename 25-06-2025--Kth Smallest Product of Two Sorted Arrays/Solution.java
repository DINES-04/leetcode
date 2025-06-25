class Solution {

    public long countlessorequal(int[] nums1, int[] nums2, long mid){
        long count=0;
        for(int a: nums1){
            if(a>=0){
                count+=countPositive(nums2,a,mid);
            }else{
                count+=countNegative(nums2,a,mid);
            }
        }
        return count;
    }

    public long countPositive(int[] nums,int a , long mid){
        int low=0,high=nums.length;

        while(low<high){
            int m= (high+low)/2;
            if((long)a * nums[m]<=mid){
                low=m+1;
            }else{
                high=m;
            }
        }
        return low;
    }

    public long countNegative(int[] nums,int a , long mid){
        int low=0,high=nums.length;

        while(low<high){
            int m= (high+low)/2;
            if((long)a * nums[m]<=mid){
                high=m;
            }else{
                low=m+1;
            }
        }
        return nums.length-low;
    }

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left=-10000000000L , right=10000000000L; 
        while(left<right){
            long mid= left + (right-left)/2;
            if(countlessorequal(nums1,nums2,mid)<k){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {-4, -2, 0, 3};  // Example array 1
        int[] nums2 = {2, 4};          // Example array 2
        long k = 6;                    // Example k value

        long result = sol.kthSmallestProduct(nums1, nums2, k);
        System.out.println("The " + k + "-th smallest product is: " + result);
    }

}