class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double[] res=new double[n/2];
        Arrays.sort(nums);
        int i=0,j=n-1;
        while(i<j){
            double sum=0.0;
            sum=(nums[i]+nums[j])/2.0;
            res[i]=sum;
            i++;
            j--;
        }
        double min=Double.MAX_VALUE;
        for(int k=0;k<res.length;k++){
            min=Math.min(min,res[k]);
        }
        return min;
    }
}