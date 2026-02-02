class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=nums[0]+nums[i]+nums[j];
                ans=Math.min(a,ans);
            }
        }
        return ans;
    }
}