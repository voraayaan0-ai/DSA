class Solution {
    public int findDuplicate(int[] nums) {
       //int n = nums.length;
       HashMap<Integer , Integer> freq = new HashMap<>();
      //freq store
      for(int n : nums){
        freq.put(n, freq.getOrDefault(n , 0) + 1);
        if(freq.get(n) > 1){
            return n;
        }
      }
      return -1;
    }
}