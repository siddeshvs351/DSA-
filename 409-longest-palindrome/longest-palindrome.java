class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        boolean hasOdd=false;
        for(int value : map.values()){
            if(value%2==0){
                count+=value;
            }
            else{
                count+=value-1;
                hasOdd=true;
            }
        }
        if(hasOdd){
            return count+1;
        }
        return count;
    }
}