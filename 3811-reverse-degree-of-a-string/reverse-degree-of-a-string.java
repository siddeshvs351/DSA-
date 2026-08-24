class Solution {
    public int reverseDegree(String s) {
        char[] arr=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int value='z' - arr[i] +1;
            value=value*(i+1);
            sum+=value;
        }
        return sum;
    }
}