class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int[][] result=new int[n/3][3];
        int row=0;
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            result[row][0] = nums[i];
            result[row][1] = nums[i + 1];
            result[row][2] = nums[i + 2];
            row++;
        }
        return result;
    }
}