class Solution {
    public int pivotIndex(int[] nums) {
      int n = nums.length;
      
      //right sum
      for(int i =0; i<n; i++){
        int ls = 0;
        int rs = 0;
        for(int j = i+1; j<n; j++){
        rs += nums[j];
      }
      //ls
      for(int k = 0; k<i; k++){
        ls += nums[k];
      }
      if(rs == ls){
        return i;
      }
      }
      
      
      

      return -1;
    }
}