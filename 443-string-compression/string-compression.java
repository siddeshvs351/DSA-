class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;
        while(i<chars.length){
            int count=0;
            char ch=chars[i];
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            chars[write++]=ch;
            if(count>1){
                String str=String.valueOf(count);
                for(char num:str.toCharArray()){
                    chars[write++]=num;
                }
            }

        }
        return write;
    }
}