class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(s == e ){
                return nums[mid];
            }
            int curV = nums[mid];
            int preV = -1;
            if(mid - 1 >= 0){
                preV = nums[mid - 1];
            }
            int nexV = -1;
            if(mid + 1 < n){
                nexV = nums[mid + 1];
            }
            if(curV != preV && curV != nexV){
                return curV;
            }
            if(curV != preV && curV == nexV){
                //left move
                int ST = mid;
                if((ST & 1) == 1){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
         else if(curV == preV && curV != nexV){
                int EI = mid;
                if((EI & 1) == 1){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}