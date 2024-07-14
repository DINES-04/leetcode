import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=target-nums[i];
            if(hp.containsKey(a))
            {
                return new int[] {hp.get(a),i};
            }
            else
            {
                hp.put(nums[i],i);
            }
        }
        return null;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of element:");
	int len=sc.nextInt();
	int[] nums= new int[len];
	System.out.println("Enter the element:");
	for(int i=0;i<len;i++){
		nums[i]=sc.nextInt();
	}
	System.out.print("Enter the target:");
	int target=sc.nextInt();
	int[] sum= twoSum(nums,target);
	 if (sum != null) {
            for (int j : sum) {
                System.out.print(j + " ");
            }
        } else {
            System.out.println("No two sum solution found.");
        }

        sc.close();
    }
}