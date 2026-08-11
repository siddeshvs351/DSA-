class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        long num=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int n=s.length();
        if(i==n) return 0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)- '0';
            num=num*10 + digit;

            if(sign==1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && -num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}