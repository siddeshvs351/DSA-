class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        String pattern;
        int len;
        
        for(len=1;len<=n/2;len++){
            if(n%len==0){
                pattern=s.substring(0,len);
                boolean match=true;
                for(int i=0;i<n;i+=len){
                    if(!s.substring(i,i+len).equals(pattern)){
                        match=false;
                        break;
                    }
                }
                if(match){
                    return true;
                }
            }
        }
        return false;
      
        
    }
}