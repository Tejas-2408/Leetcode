package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    static List<List<String>> solveNQueens(int n){
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        place(board,0,ans);
        return ans;
    }

    static void place(boolean[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(finalBoard(board));
            return;
        }

        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                place(board,row+1,ans);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] arr, int row, int col){
        for(int i = row; i >= 0; i--){
            if(arr[i][col]){
                return false;
            }
        }

        int left = Math.min(row,col);
        int right = Math.min(arr.length-1-col,row);

        for(int i = 1;i <= left; i++){
            if(arr[row-i][col-i]){
                return false;
            }
        }

        for(int i = 1; i <= right; i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static List<String> finalBoard(boolean[][] board) {
        List<String> result = new ArrayList<>();

        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            result.add(sb.toString());
        }

        return result;
    }
}
