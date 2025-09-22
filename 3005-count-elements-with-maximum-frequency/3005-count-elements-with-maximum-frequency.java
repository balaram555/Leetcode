class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=-1;
        int count=0;
        for(int n:map.values()){
            if(n>max){
                max=n;
                count=1;
            }
            else if(max==n)
            count++;
        }
        return count*max;
    }
}