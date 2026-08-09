class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int n=s.length();
        String current=s;
        for(int i=0;i<n;i++){
            char firstChar=current.charAt(0);
            String rest=current.substring(1,n);
            current=rest+firstChar;
            if(current.equals(goal)){
                return true;
            }

        }
        return false;

    }
}