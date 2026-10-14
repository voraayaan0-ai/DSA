class Solution {
    static boolean cf(int count1[] , int count2[]){
        for(int i = 0; i<26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        //algo
        //basic check if s1 charcater is present or not in s2 
        //s1 table creation
        //s2 table creation
        //s2 comparision

        if(s1.length() > s2.length()){
            return false;
        }
        int count1[] = new int[26];
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }


        int i = 0;
        int wl = s1.length();
        int count2[] = new int[26];
        for(i = 0; i<wl; i++){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }
        if(cf(count1 , count2) == true){
            return true;
        }
        else{
            while(i < s2.length()){
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;
                int oldCharIndex = i - wl;
                char oldchar = s2.charAt(oldCharIndex);
                int fti = oldchar - 'a';
                count2[fti]--;
                if(cf(count1 , count2) == true){
                    return true;
                }
                    i++;
                
            }
        }
        return false;
    }
}