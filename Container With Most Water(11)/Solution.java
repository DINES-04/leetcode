import java.util.*;
class Solution {
    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        while(i<j){
            int area= Math.min(height[i],height[j]) * (j-i);

            maxarea= Math.max(area,maxarea);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            } 
        }
        return maxarea;
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of element:");
	int len= sc.nextInt();
	System.out.println("Enter the element:");
	int[] arr= new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int res = maxArea(arr);
	System.out.println(res);
    }
}

/* two pointer concept with compare first and last*/