class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]>=arr[mid+1]){
                //move left
                e = mid - 1;
                ans = mid;

            }
            else if(arr[mid]<arr[mid+1]){
                //move right
                s = mid + 1;
            }
        }
        return ans;
        
    }
}