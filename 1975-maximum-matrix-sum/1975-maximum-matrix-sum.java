class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int[]i:matrix){
            for(int j:i){
                if(j<0)
                count++;
                int val=Math.abs(j);
                sum +=val;
                min=Math.min(min,val);
            }
        }
        if(count%2 !=0)
        sum -=2L*min;
        return sum;
    }
}