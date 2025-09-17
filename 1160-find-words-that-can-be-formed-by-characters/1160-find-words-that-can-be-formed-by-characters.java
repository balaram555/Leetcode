class Solution {
    public int countCharacters(String[] words, String chars) {
      HashMap<Character,Integer> cha=new HashMap<>();
      for(char c:chars.toCharArray()){
        cha.put(c,cha.getOrDefault(c,0)+1);
      }
      int i=0;
      int count=0;
      while(i<words.length){
      HashMap <Character,Integer> map=new HashMap<>();
      for(char c:words[i].toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }
      boolean can = true;
        for (char c : map.keySet()) {
            if (map.get(c) > cha.getOrDefault(c, 0)) {
                can = false;
                break;
            }
        }

        if (can) {
            count += words[i].length();
        }
        i++;
      }
      return count;
    }
}