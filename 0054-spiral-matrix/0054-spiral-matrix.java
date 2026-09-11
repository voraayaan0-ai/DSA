class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int strow = 0;
        int endrow = m-1;
        int stcol = 0;
        int endcol = n-1;
         List<Integer> result =  new ArrayList<>();
         while(strow <= endrow && stcol <= endcol){
        //Step-1 print L to R
       for(int col = stcol; col<=endcol; col++){
        result.add(matrix[strow][col]);
       }
       strow++;
       //Step-2 print T to B
       for(int row = strow; row<=endrow; row++){
        result.add(matrix[row][endcol]);
       }
       endcol--;
       if(strow <= endrow){
        //Step-3 print R to L
       for(int col = endcol; col>=stcol; col--){
        result.add(matrix[endrow][col]);
       }
       endrow--;
       } 
       if(stcol <= endcol){
        //Step-4 print B to T
       for(int row = endrow; row>=strow; row--){
        result.add(matrix[row][stcol]);
       }
       stcol++;
       }      
         }
         return result;
    }
}