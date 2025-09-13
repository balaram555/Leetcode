class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
       int max = 0;
        for (int val : map.values()) {
            max = Math.max(max, val);
        }
        HashMap<Character, Integer> conso = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                conso.put(c, conso.getOrDefault(c, 0) + 1);
            }
        }
        int maxc = 0;
        for (int val : conso.values()) {
            maxc = Math.max(maxc, val);
        }
      return max+maxc;
    }
}