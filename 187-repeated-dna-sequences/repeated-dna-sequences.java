class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen=new HashSet<>();
        HashSet<String> result=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            if(seen.contains(s.substring(i,i+10))){
                result.add(s.substring(i,i+10));
            }
            seen.add(s.substring(i,i+10));
        }
        return new ArrayList<>(result);
    }
}