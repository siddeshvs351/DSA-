class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
        while(left<=right){
            int num=left;
            boolean valid=true;
            while(num>0){
                int digit=num%10;
                if(digit==0){
                    valid=false;
                    break;
                }
                if(left%digit!=0){
                    valid=false;
                    break;
                }
                num=num/10;
            }
            if(valid){
                list.add(left);
            }
            left++;
        }
        return list;
    }
}