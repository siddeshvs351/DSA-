class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int prev=nums[i-1];
            for(int j=prev+1;j<nums[i];j++){
                list.add(j);
            }
        }
        return list;
    }
}