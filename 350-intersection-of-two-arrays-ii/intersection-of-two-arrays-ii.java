class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int num:nums1){
            stack.push(num);
        }
        for(int num:nums2){
            if(stack.contains(num)){
                list.add(num);
                stack.remove(Integer.valueOf(num));
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
}