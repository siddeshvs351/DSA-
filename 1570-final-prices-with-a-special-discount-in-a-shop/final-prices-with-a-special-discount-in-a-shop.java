class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int[] answer=prices.clone();
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                int index=stack.pop();
                answer[index]=prices[index]-prices[i];
            }
            stack.push(i);
        }
        return answer;
    }
}