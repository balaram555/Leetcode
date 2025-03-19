class Solution {
    public int heightChecker(int[] heights) {
        int[] old = Arrays.copyOf(heights, heights.length + 1);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<=heights.length-1;i++){
            if(heights[i]!=old[i])
            count++;
        }
        return count;
    }
}