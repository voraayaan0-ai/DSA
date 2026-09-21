class Solution {
    static boolean isva(int arr[] , int k , int mid){
        int pc = 1;
        int pl = 0;
        for(int i = 0; i<arr.length; i++){
            if(pl + arr[i] <= mid){
                pl = pl + arr[i];
            }
            else{
                pc++;
                pl = 0; 
                if(pc > k || arr[i] > mid){
                    return false;
                }
                else{
                    pl = pl + arr[i];
                }
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int sum = 0; 
        for(int i = 0 ; i<arr.length; i++){
           sum += arr[i]; 
        }
        int ans = -1;
        int s = 0;
        int e = sum;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(isva(arr , k , mid)){
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid + 1; 
            }
        }
        return ans;
    }
}
