class Solution {
    public int findGCD(int[] nums) {
      int max=nums[0];
      int min=nums[0];
       for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
       while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max; 
    }
}