class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0; 
        for(int i = 0; i<=n; i++){
            xor = xor ^ i;
        }
        for(int num : nums){
            xor  = xor ^ num;     
        }
        return xor;
    }
}