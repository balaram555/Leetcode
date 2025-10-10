class Solution {
    public List<String> commonChars(String[] words) {
       HashMap<Character,Integer> map=new HashMap<>();
       for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> Map = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                Map.put(c, Map.getOrDefault(c, 0) + 1);
            }
              for (char c : new HashSet<>(map.keySet())) {
                if (Map.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), Map.get(c)));
                } else {
                    map.remove(c); 
                }
            }
        }
         ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}