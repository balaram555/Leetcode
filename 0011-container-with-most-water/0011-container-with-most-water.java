class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r){
            int a=Math.min(height[r],height[l]);
            int area=a*(r-l);
            max=Math.max(max,area);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return max;
    }
}