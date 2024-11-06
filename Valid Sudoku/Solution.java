import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row
        HashSet<Character> hsr = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }else if(hsr.contains(board[i][j])){
                   return false; 
                }else{
                    hsr.add(board[i][j]);
                }
            }
        }
        // column
        HashSet<Character> hsc = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }else if(hsc.contains(board[j][i])){
                   return false; 
                }else{
                    hsc.add(board[j][i]);
                }
            }
        }
        // boxes
        HashMap<String,HashSet<Character>> hmb = new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                String temp= (i/3)+","+(j/3);
                if(board[i][j]=='.'){
                    continue;
                }else if (hmb.containsKey(temp) && hmb.get(temp).contains(board[i][j])) {
                    return false;
                }else{
                    hmb.putIfAbsent(temp, new HashSet<>()); 
                    hmb.get(temp).add(board[i][j]);
                }                 
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean isValid = solution.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid : " + isValid); // Output: true
    }
}
