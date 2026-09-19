class Solution {
    int floorSqrt(int n) {
        int s = 0;
        int e = n;
        int ans = -1;
        while( s <= e){
            int mid = s + (e - s)/2;
            if(mid * mid == n){
               return mid;
            }
            else if(mid * mid > n){
                e = mid -1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
            
        }
        return ans;
    }
}
