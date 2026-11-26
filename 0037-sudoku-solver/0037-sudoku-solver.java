class Solution {
    static boolean findemptycell(char[][] board , int[] emptycell){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    emptycell[0] = i;
                    emptycell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isstp(char[][] board , char charvalue , int ri , int ci){
        //h
      for(int col = 0; col < 9; col++){
        if(board[ri][col] == charvalue){
            return false;
        }
      }
      //v
       for(int row = 0; row < 9; row++){
        if(board[row][ci] == charvalue){
            return false;
        }
      }
      ///3*3
     int sr = ri - ri%3;
     int cr = ci - ci%3;
     for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            int ar = sr + i;
            int ac = cr + j;
            if(board[ar][ac] == charvalue){
                return false;
            }
        }
     }
     return true;

    }
    static boolean solve(char[][] board){
        int emptycell [] = new int[2];
         if(!findemptycell(board , emptycell) ){
            return true;
         }
         int ri = emptycell[0];
         int ci = emptycell[1];
          for(int value = 1; value<=9 ; value++){
            char charvalue = (char)(value + '0');
            if(isstp(board , charvalue , ri , ci)){
                board[ri][ci] = charvalue;
                if(solve(board) == true){
                    return true;
                }
                 board[ri][ci] = '.';
            }
          }



return false;

    }
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
}