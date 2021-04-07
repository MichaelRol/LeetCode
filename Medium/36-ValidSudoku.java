class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (checkRows(board) && checkCols(board) && checkBoxes(board)) {
            return true;
        }
        return false;
    }
    
    public boolean checkRows(char[][] board) {
        for(int i = 0; i < 9; i++) {
            boolean[] contains = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int value = Character.getNumericValue(board[i][j]);
                    if (!contains[value - 1]) {
                        contains[value - 1] = true;
                    } else {
                        return false;
                    }
                    
                }
            }
        }
        return true;        
    }
    
    public boolean checkCols(char[][] board) {
        for(int j = 0; j < 9; j++) {
            boolean[] contains = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int value = Character.getNumericValue(board[i][j]);
                    if (!contains[value - 1]) {
                        contains[value - 1] = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkBoxes(char[][] board) {
        for (int offsetX = 0; offsetX < 3; offsetX++) {
            for (int offsetY = 0; offsetY < 3; offsetY++) {
                boolean[] contains = new boolean[9];
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (board[offsetX*3 + x][offsetY*3 + y] != '.') {
                            int value = Character.getNumericValue(board[offsetX*3 + x][offsetY*3 + y]);
                            if (!contains[value - 1]) {
                                contains[value - 1] = true;
                            } else {
                                return false;
                            }
                        }
                    }      
                }            
            }
        }
        return true;        
    }
}