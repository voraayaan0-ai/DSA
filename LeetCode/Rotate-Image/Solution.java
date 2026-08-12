1class Solution {
2    public void rotate(int[][] matrix) {
3        //step-1 Transpose the array
4        //swap matrix[i][j] matrix[j][i]
5        int N1 = matrix.length;
6        int N2 = matrix.length;
7        for(int i = 0; i<N1; i++){
8            for(int j = i+1; j<N2; j++){
9                int temp = matrix[i][j];
10                matrix[i][j] = matrix[j][i];
11               matrix[j][i] = temp;
12            }
13        }
14
15        //step-2 reverse the row of matrix 
16        //har row par jaunga like 1d array
17        for(int row = 0; row<N1; row++){
18            //I am at a new row now I will reverse it
19            int Stcol = 0;
20            int Encol = N1-1;
21            while(Stcol <= Encol){
22                //swap 
23                int temp = matrix[row][Stcol];
24                matrix[row][Stcol] = matrix[row][Encol];
25                matrix[row][Encol] = temp;
26
27                Stcol++;
28                Encol--;
29            }
30        }
31
32    }
33}