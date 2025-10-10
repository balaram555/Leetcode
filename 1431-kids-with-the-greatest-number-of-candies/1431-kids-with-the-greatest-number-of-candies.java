class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max1=Integer.MIN_VALUE;
        List<Boolean> arr=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            max1=Math.max(max1,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max1)
            arr.add(true);
            else 
            arr.add(false);
        }
      return arr;
    }
}