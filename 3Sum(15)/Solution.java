import java.util.*;
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> h= new HashSet<>(); 
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                h.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }else if(sum<0){
                j++;
            }else{
                k--;
            }
          }
        }
        return new ArrayList<>(h);
    }
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the no. of element:");
	int len= sc.nextInt();
	System.out.println("Enter the element:");
	int[] arr = new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	List<List<Integer>> res= threeSum(arr);
	System.out.println(res);
    }
}

/*using two pointer concept which use at after ith element */