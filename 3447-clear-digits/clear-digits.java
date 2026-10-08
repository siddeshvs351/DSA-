class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    if(Character.isDigit(s.charAt(i))){
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            ans.append(stack.get(i));
        }
        
        return ans.toString();
    }
}