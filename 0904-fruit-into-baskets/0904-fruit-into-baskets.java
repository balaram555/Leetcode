class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0, max=0;
        for(int i=0;i<fruits.length;i++){
            int a=fruits[i];
            map.put(a,map.getOrDefault(a,0)+1);
        while(map.size()>2){
            int j=fruits[left];
            map.put(j,map.get (j)-1);
            if(map.get(j)==0){
                map.remove(j);
            }
            left++;
        }
        max=Math.max(max,i-left+1);
        }
        return max;
    }
}