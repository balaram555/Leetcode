class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans=new int[num_people];
        int gi=1;
        int i=0;
        while(candies>0){
            int cur=Math.min(gi,candies);
            ans[i] +=cur;
            candies -=cur;
            gi++;
            i=(i+1)% num_people;
        }
        return ans;
    }
}