class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> Set = new HashSet<>();
        for (String b : banned) {
            Set.add(b.toLowerCase());
        }

        String normalized = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = normalized.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!Set.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String maxWord = "";
        int maxCount = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > maxCount) {
                maxWord = word;
                maxCount = map.get(word);
            }
        }

        return maxWord;
    }
}
