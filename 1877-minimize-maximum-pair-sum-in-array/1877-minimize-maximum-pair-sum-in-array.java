class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int[] max=new int[nums.length/2];
       int f=nums[0];
       int l=nums[nums.length-1];
       int i=0;
       int j=nums.length-1;
       while(i<j){
        max[i]=f+l;
        f--;
        l++;
        i++;
        j--;
       }
       int ans=0;
       for(int k=0;k<max.length;k++){
        ans=Math.max(ans,max[k]);
       }
       return ans;
    }
}