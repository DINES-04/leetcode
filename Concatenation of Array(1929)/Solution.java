import java.util.*;
class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] arr= new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]= nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no.of number:");
	int len=sc.nextInt();
	int[] arr = new int[len];
	System.out.print("Enter the element:");
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int[] res= getConcatenation(arr);
	for(int j=0;j<2*len;j++){
		System.out.print(res[j]+" ");
	}
    }
}