class Solution {
    static int getFirstoccurence(int[] row) {
        int tc = row.length;
        
        // Zero case: If the last element after sorting is 0, there are no 1s
        if (row[tc - 1] == 0) {
            return tc;
        }

        int s = 0;
        int e = tc - 1;
        int ans = tc;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (row[mid] == 1) {
                ans = mid;
                e = mid - 1; // Keep searching left for the first 1
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int tr = mat.length;
        int tc = mat[0].length;
        int maxi = -1;
        int oneindex = 0;

        for (int row = 0; row < tr; row++) {
            // Sort a copy of the row so binary search works correctly
            int[] sortedRow = mat[row].clone();
            Arrays.sort(sortedRow);

            int foc = getFirstoccurence(sortedRow);
            int c = tc - foc;

            // Updated condition: c > maxi (without checking c != 0)
            if (c > maxi) {
                maxi = c;
                oneindex = row;
            }
        }

        return new int[]{oneindex, maxi};
    }
}