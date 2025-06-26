import java.util.*;
public class Solution {

    public static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> res = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>max){
                res.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        ArrayList<Integer> res = sol.leaders(arr);
        for(int num: res){
            System.out.println(num);
        }
    }
}
