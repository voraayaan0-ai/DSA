class Solution {
    static int lowerbounf(int arr[] , int target){
            int n = arr.length;
            int s = 0;
            int e = n-1;
            int ans = n;
            int mid = s + (e-s)/2;

            while(s<=e){
                if (arr[mid] >= target){
                    //ans store
                    ans = mid;
                    e = mid-1;

                }
                else{
                    //target>arr[mid]
                    s = mid + 1;
                }
                mid = s + (e-s)/2;

            }
    return ans;
        }
        static int upperbound(int arr[] , int target){
                int n = arr.length;;
                int s = 0;
                int e = n -1;
                int ans = n;
                while(s<=e){
                    int mid = s+(e-s)/2;
                    if (arr[mid] <= target){
                        //move right
                        s = mid +1;

                    }
                    else{
                        //ans store
                        ans = mid;
                        //move left
                        e = mid -1;
                    }
                }
                return ans;

            }
    int countFreq(int[] arr, int target) {
        // code here
        int lb = lowerbounf(arr , target);
        int ub = upperbound(arr , target);
        int ans = ub - lb;
        return ans;
        
    }
}
