class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Tr = matrix.length;
        int Tc = matrix[0].length;
        int n = Tr * Tc;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            int RI = mid/Tc;
            int CI = mid % Tc;

            if(matrix[RI][CI] == target){
                return true;
            }
            else if (matrix[RI][CI] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }
}