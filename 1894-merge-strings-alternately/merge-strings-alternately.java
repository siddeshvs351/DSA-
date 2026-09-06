class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int l=0;
        int r=0;
        int n=word1.length();
        int m=word2.length();
        while(l<n || r<m){

            if(l<n){
            str+=word1.charAt(l);
            l++;
            }
            if(r<m){
                str+=word2.charAt(r);
                r++;
            }
        }
        return str;
    }
}