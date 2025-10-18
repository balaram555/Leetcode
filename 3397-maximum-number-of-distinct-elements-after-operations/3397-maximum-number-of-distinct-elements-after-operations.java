class Solution {
    public int maxDistinctElements(int[] nums, int k) {
      Arrays.sort(nums);
      int max=Integer.MIN_VALUE;
      int ans=0;
      for(int num:nums){
        if(max<num+k){
            int a=Math.max(max+1,num-k);
            max=a;
            ans++;
        }
      } 
      return ans; 
    }
}