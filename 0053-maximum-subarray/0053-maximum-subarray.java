class Solution {
    public int maxSubArray(int[] nums) {
        int sum1=nums[0];
        int sum2=nums[0];
        for(int i=1;i<nums.length;i++){
            sum1=Math.max(nums[i],sum1+nums[i]);
            sum2=Math.max(sum1,sum2);
        }
        return sum2;
    }
}