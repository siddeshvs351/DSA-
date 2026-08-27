class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minValue=arrays.get(0).get(0);
        int maxValue=arrays.get(0).get(arrays.get(0).size()-1);
        int result=0;
        for(int i=1;i<arrays.size();i++){
            int currMin=arrays.get(i).get(0);
            int currMax=arrays.get(i).get(arrays.get(i).size()-1);
            result=Math.max(result,currMax-minValue);
            result=Math.max(result,maxValue-currMin);
            minValue=Math.min(currMin,minValue);
            maxValue=Math.max(currMax,maxValue);
        }
        return result;
    }
}