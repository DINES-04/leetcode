import java.util.Scanner;

public class Solution {

        public boolean canReach(int[] arr, int start) {

            // Out of bounds or already visited
            if (start < 0 || start >= arr.length || arr[start] < 0) {
                return false;
            }

            // Found zero
            if (arr[start] == 0) {
                return true;
            }

            int jumpDistance = arr[start];

            // Mark as visited
            arr[start] = -1;

            // Check both directions
            return canReach(arr, start + jumpDistance)
                    || canReach(arr, start - jumpDistance);
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input start index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        Solution sol = new Solution();

        boolean result = sol.canReach(arr, start);

        System.out.println("Can reach zero: " + result);

        sc.close();
    }
}