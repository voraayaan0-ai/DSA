class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;

        while(readIndex < chars.length){
            char currentchar = chars[readIndex];
            int count = 0; 

            while(readIndex < chars.length && currentchar == chars[readIndex]){
                readIndex++;
                count++;

            }
            chars[writeIndex] = currentchar;
            writeIndex++;
            if(count > 1){
                String str  = String.valueOf(count);
                for(char digit : str.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
}