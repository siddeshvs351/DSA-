class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber >0){
            int rem=(columnNumber-1)%26;
            char ch=(char)('A'+rem);
            result.append(ch);
            columnNumber=(columnNumber-1)/26;
        }
        return result.reverse().toString();
    }
}