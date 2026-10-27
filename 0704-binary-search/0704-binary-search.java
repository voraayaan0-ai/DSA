class Solution {
    static int solve(int nums[] , int target , int s , int e){
        //bc
        if(s > e){
            return -1; 
        }
        //process
        int mid = s + (e - s)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            e = mid - 1;
        }
        else if(nums[mid] < target){
            s = mid + 1;
        }
        //r.c
      int ans  = solve(nums , target , s , e);
      return ans;
    }
    public int search(int[] nums, int target) {
        int s  = 0;
        int e = nums.length - 1;
     int ans =  solve(nums , target , s , e);
return ans;

    }
}