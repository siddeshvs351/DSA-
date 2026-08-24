class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' ' || i==arr.length-1){
                int left=start;
                int right=(arr[i]==' ')?i-1:i;
                start=i+1;
                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    right--;
                    left++;
                }
            }
            
        }
        return new String(arr);
        

    }
}