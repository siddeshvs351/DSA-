class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                char top=stack.peek();
                if(Character.toLowerCase(c)==Character.toLowerCase(top) && top!=c){
                    stack.pop();
                }
                else{stack.push(c);}
            }

        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            ans.append(stack.get(i));
        }
        
        return ans.toString();
    }
}
