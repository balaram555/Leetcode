class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        String ans="";
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(map.size()>0){
        char maxc = ' ';
        int maxf = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxf) {
                maxf = entry.getValue();
                maxc = entry.getKey();
            }
        }
        for(int i=0;i<maxf;i++){
            ans+=maxc;
        }
        map.remove(maxc);
        }
        return ans;
    }
}