class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            }
            if(map1.containsKey(word)){
                if(map1.get(word)!=c){
                    return false;
                }
            }
                
            map.put(c,word);
            map1.put(word,c);
        }
        return true;
    }
}