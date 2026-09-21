class Solution {
    static boolean isva(int arr[] , int k , int mid){
        int sc = 1;
        int page = 0;
        for(int i = 0; i<arr.length; i++){
            if(page + arr[i] <= mid){
                page = page + arr[i];
            }
            else{
                sc++;
                if(sc > k || arr[i]  > mid){
                    return false;
                }
                else{
                    page = 0;
                    page = page + arr[i];
                }
               
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }
       int n = arr.length;
       int s  = 1;
       int sum = 0;
       for(int i = 0; i<n; i++){
           sum += arr[i];
       }
       int e = sum;
       int ans = -1;
       while(s <= e){
           int mid = s + (e-s)/2;
           if(isva(arr , k ,mid)){
               ans = mid;
               e = mid - 1;
           }
           else{
               s = mid + 1;
           }
       }
       return ans;
    }
}
