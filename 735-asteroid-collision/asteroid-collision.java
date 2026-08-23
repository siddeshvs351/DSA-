class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int current=asteroids[i];
            boolean alive =true;
            while(!stack.isEmpty() && stack.peek()>0 && current<0){
                if(stack.peek()< Math.abs(current)){
                    stack.pop();
                }
                else if(stack.peek()== Math.abs(current)){
                    stack.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                stack.push(current);
            }
            
        } 
    int[] result= new int[stack.size()];
    for(int i=0;i<stack.size();i++){
        result[i]=stack.get(i);
    }
    return result;
    }
}