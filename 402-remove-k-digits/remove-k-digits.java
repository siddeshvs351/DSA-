class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
        if(k==num.length()){
            return "0";
        }
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty() && k>0 && stack.peek() - '0'>num.charAt(i) - '0'){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        String str="";
        for(int i=0;i<stack.size();i++){
            str=str+stack.get(i);
        }
        str=str.replaceFirst("^0+","");
        if(str.isEmpty()){
            return "0";
        }
        return str;

    }
}