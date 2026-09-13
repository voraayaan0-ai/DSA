class Solution {
    public void rotate(int[][] matrix) {
        //step - 1 --> Tranaspose a matrix
        int row = matrix.length;
        int col = matrix.length;
        for(int i = 0; i<row; i++){
            for(int j = i+1; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse an row
       for(int Row = 0; Row < row; Row++ ){
        int start = 0;
        int end = row - 1;
        while(start <= end){
             int temp = matrix[Row][start];
                matrix[Row][start] = matrix[Row][end];
                matrix[Row][end] = temp;
                start++;
                end--;
        }

       }
        
        }
        
    }
