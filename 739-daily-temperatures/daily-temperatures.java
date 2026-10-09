class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                int prev=stack.pop();
                ans[prev]=i-prev;
            }
            stack.push(i);
        }
        return ans;

    }
}