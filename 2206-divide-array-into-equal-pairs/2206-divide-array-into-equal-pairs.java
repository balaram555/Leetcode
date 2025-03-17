class Solution {
    public boolean divideArray(int[] nums) {
       HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;

    }
}