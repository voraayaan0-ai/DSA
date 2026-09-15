class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]>=target){
                return i;
            }
            // if(arr[i] <= target){
            //     return i - 1;
            // }
        }
    return n;    
    }
}
