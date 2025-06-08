import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void recursion(ArrayList<Integer> res, int n, int curr) {
        if (curr > n) {
            return;
        }
        res.add(curr);
        for (int i = 0; i <= 9; i++) {
            recursion(res, n, curr * 10 + i);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            recursion(res, n, i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 30; 
        List<Integer> result = sol.lexicalOrder(n);
        
        System.out.println("Lexicographical Order from 1 to " + n + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
