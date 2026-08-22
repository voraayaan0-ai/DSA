class Solution {
    static int pivotindex(int nums[]){
        int n = nums.length;
        int s = 0;
        int e = n -1;
        int ans = -1;
        if(nums[s]<nums[e]){
            //no effective rotation
            return -1;
        }
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]<=nums[n-1]){
                //left move 
                e = mid - 1;
            }
            else{
                ////nums[mid]>nums[n-1]
                ans = mid;
                s = mid +1;
            }
        }
        return ans;
    }
    static int binarySearch(int nums[], int s, int e, int target) {
    int n = nums.length;

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        } 
        else if (target > nums[mid]) {
            s = mid + 1;
        } 
        else {
            e = mid - 1;
        }
    }
    return -1;
}
    public int search(int[] nums, int target) {
        int pivotindex = pivotindex(nums);
        int n = nums.length;
        if(pivotindex == -1){
            int ans = binarySearch(nums , 0 , n-1, target);
            return ans ;
        }
        else{
            // l1 and L2 wala logic
             int startArray1 =0;
        int endArray1 = pivotindex;
        if(target>=nums[startArray1] && target<=nums[endArray1]){
            int ans = binarySearch(nums , startArray1 , endArray1 , target);
            return ans;
        }
        int startArray2 = pivotindex+1;
        int endArray2 = n-1;
        if(target>=nums[startArray2] && target<=nums[endArray2]){
            int ans = binarySearch(nums , startArray2 , endArray2 , target);
            return ans;
        }

        }
       return -1;

    }
}