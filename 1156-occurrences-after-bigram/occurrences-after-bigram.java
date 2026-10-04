class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list=new ArrayList<>();

       String[] words=text.split(" ");
       for(int i=0;i<words.length-2;i++){
        if(words[i].equals(first) && words[i+1].equals(second)){
            list.add(words[i+2]);
        }
       }
       return list.toArray(new String[0]);
    }
}