import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);

        int a = hp.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (hp.get(s.charAt(i)) < hp.get(s.charAt(i + 1))) {
                a = a - hp.get(s.charAt(i));
            } else {
                a = a + hp.get(s.charAt(i));
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman1 = "III";
        System.out.println(roman1 + " -> " + solution.romanToInt(roman1)); 
    }
}
