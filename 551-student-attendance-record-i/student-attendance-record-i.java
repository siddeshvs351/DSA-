class Solution {
    public boolean checkRecord(String s) {
        char[] arr=s.toCharArray();
        int absent=0;
        int late=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                absent++;
                late=0;
                if(absent>=2){
                    return false;
                }
            }
            else if(arr[i]=='L'){
                late++;
                if(late>=3){
                    return false;
                }
            }
            else{
                late=0;
            }
    }
    return true;
    }
}