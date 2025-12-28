package recursion;

// https://leetcode.com/problems/sudoku-solver/description/

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                    {'.','6','.','.','.','.','2','8','.'},
                                        {'.','.','.','4','1','9','.','.','5'},
                                            {'.','.','.','.','8','.','.','7','9'}
        };

        if(sudokuSolver(board)){
            display(board);
        }
    }

    static boolean sudokuSolver(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        if(emptyLeft){
            // sudoku is solved
            return true;
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, Character.forDigit(number,10))) {
                board[row][col] = Character.forDigit(number,10);
                if (sudokuSolver(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    static boolean isSafe(char[][] arr, int row, int col, char ch){
        // column check
        for(int i = 0; i < arr.length; i++){
            if(arr[row][i] == ch){
                return false;
            }
        }

        // row check
        for(int i = 0; i < arr.length; i++){
            if(arr[i][col] == ch){
                return false;
            }
        }

        // check in internal array
        int sqrt = (int)Math.sqrt(arr.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int i = rowStart; i < rowStart + sqrt; i++){
            for(int j = colStart; j < colStart + sqrt; j++){
                if(arr[i][j] == ch){
                    return false;
                }
            }
        }

        return true;
    }

    static void display(char[][] arr){
        for(char[] s: arr){
            System.out.println(Arrays.toString(s));
        }
    }
}
