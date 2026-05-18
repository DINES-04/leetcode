import java.util.*;

class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        int step = 0;

        // Fill the map
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        while (!q.isEmpty()) {
            step++;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int j = q.poll();

                // Move left
                if (j - 1 >= 0 && map.containsKey(arr[j - 1])) {
                    q.offer(j - 1);
                }

                // Move right
                if (j + 1 < n && map.containsKey(arr[j + 1])) {
                    if (j + 1 == n - 1) return step;
                    q.offer(j + 1);
                }

                // Same value jumps
                if (map.containsKey(arr[j])) {
                    for (int k : map.get(arr[j])) {
                        if (k != j) {
                            if (k == n - 1) return step;
                            q.offer(k);
                        }
                    }
                }

                map.remove(arr[j]);
            }
        }

        return step;
    }

    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};

        int result = sol.minJumps(arr);

        System.out.println("Minimum jumps: " + result);
    }
}