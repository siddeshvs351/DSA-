import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
        }
        int degree = 0;
        for (int val : freq.values()) {
            degree = Math.max(degree, val);
        }
        int minLength = nums.length;
        for (int key : freq.keySet()) {
            if (freq.get(key) == degree) {
                int length = last.get(key) - first.get(key) + 1;
                minLength = Math.min(minLength, length);
           }
        }
        return minLength;
    }
}