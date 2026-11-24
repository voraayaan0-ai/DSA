class Solution {
    static boolean iss(int ri , int coli , int n , char[][]board){
        //check left horizontal
        int row = ri;
        int col = coli;
        while(col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }
        //left diagnol
        row = ri;
        col = coli;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row = row - 1;
            col = col - 1;
        }
        //left lower diagonal
         row = ri;
        col = coli;
         while(row < n && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row = row + 1;
            col = col - 1;
        }

        return true;
    }
    static void solve( char[][] board , int n , int coli , List<List<String>> ans){
        if(coli >= n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i<n; i++){
            temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
            for(int ri = 0; ri < n; ri++){
                if(iss(ri , coli , n , board)){
                    board[ri][coli] = 'Q';
                    solve(board , n , coli + 1 , ans);

                    board[ri][coli] = '.';
                }
            }
        }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(board[i] , '.');

        }

        int coli = 0;

        List<List<String>> ans = new ArrayList<>();

        solve(board , n , coli , ans);

        return ans;


    }
}