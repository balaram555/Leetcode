class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            count += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count; 
    }
}