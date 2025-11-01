class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0;
        int c=0;
       for(int i=0;i<n;i++){
        if(nums[i]>0&&nums[i]<=9)
        sum +=nums[i];
        else if (nums[i] >= 10 && nums[i] <= 99)
        c +=nums[i];
       } 
       if(sum==c)
       return false;
       return true;
    }
}