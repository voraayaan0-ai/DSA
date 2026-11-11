class Solution {
    static void solve(int nums[] , int index , List<Integer> output ,  List<List<Integer>> ans){
        //b.c 
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        //rec
        int currv = nums[index];
        output.add(currv);
        solve(nums , index + 1, output , ans);
        //bt
        output.remove(output.size()-1);
        //exclude
         solve(nums , index + 1, output , ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
       solve(nums , index , output , ans);
       return ans;
    }
}