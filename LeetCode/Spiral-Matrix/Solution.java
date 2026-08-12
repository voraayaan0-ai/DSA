1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int strow = 0;
6        int endrow = m-1;
7        int stcol = 0;
8        int endcol = n-1;
9         List<Integer> result =  new ArrayList<>();
10         while(strow <= endrow && stcol <= endcol){
11        //Step-1 print L to R
12       for(int col = stcol; col<=endcol; col++){
13        result.add(matrix[strow][col]);
14       }
15       strow++;
16       //Step-2 print T to B
17       for(int row = strow; row<=endrow; row++){
18        result.add(matrix[row][endcol]);
19       }
20       endcol--;
21       if(strow <= endrow){
22        //Step-3 print R to L
23       for(int col = endcol; col>=stcol; col--){
24        result.add(matrix[endrow][col]);
25       }
26       endrow--;
27       } 
28       if(stcol <= endcol){
29        //Step-4 print B to T
30       for(int row = endrow; row>=strow; row--){
31        result.add(matrix[row][stcol]);
32       }
33       stcol++;
34       }      
35         }
36         return result;
37    }
38}