class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return Integer.compare(map.get(b),map.get(a));
            }
            return a.compareTo(b);
        });
        return new ArrayList<>(list.subList(0,k));
    }
}