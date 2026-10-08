class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            
            else{
                char top=stack.peek();
                if(ch==top){
                    stack.pop();
                }else{
                    stack.push(ch);
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