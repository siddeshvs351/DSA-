class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder str=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            
                char ch=t.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)<0){
                    return ch;
                }
            
            
        }
        return ' ';
        
    }
}