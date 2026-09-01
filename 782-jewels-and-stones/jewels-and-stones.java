class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:stones.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(map.containsKey(ch)){
                count+=map.get(ch);
            }
        }
        return count;
    }
}