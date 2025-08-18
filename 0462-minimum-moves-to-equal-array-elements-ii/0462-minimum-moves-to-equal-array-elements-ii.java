class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=nums[n/2];
        int count=0;
        for(int num:nums){
            count+=Math.abs(mid-num);
        }
        return count;
    }
}