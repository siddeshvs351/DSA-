class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
             char ch1=arr[l];
             char ch2=arr[r];
             if (!Character.isLetter(arr[l])) {
    l++;
}
else if (!Character.isLetter(arr[r])) {
    r--;
}
else {
    char temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;

    l++;
    r--;
}
        
        }
        return new String(arr);
    }
}