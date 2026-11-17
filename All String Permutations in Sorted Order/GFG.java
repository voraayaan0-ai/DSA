class Solution {
    static void solve(String s , String output , ArrayList<String> ans){
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            String remstring = s.substring(0 , i) + s.substring(i + 1); 
            solve(remstring , output + ch , ans);
        }
        
        
    }
    public ArrayList<String> permutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        solve(s , "" , ans);
        Collections.sort(ans);
        return ans;
    }
}
