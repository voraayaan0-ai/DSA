class Solution {
    static void getAllSub(String s , int index ,  StringBuilder output ,  List<String> ans){
        //Bc
        if(index >= s.length()){
            String subseq = output.toString();
            ans.add(subseq);
            return;
        }
        //process
        char ch = s.charAt(index);
        output.append(ch);
        //
        getAllSub(s , index + 1 , output , ans);
        output.deleteCharAt(output.length()-1);
        getAllSub(s , index + 1 , output , ans);
        
    } 
    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;
        
        getAllSub(s , index , output , ans);
        Collections.sort(ans);
        return ans;
        
    }
}
