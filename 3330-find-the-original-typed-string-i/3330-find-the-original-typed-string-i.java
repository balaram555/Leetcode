class Solution {
    public int possibleStringCount(String word) {
      Set<String> results = new HashSet<>();
        results.add(word); 

        int n = word.length();
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int runLength = j - i;
            if (runLength >= 2) {
                for (int newLen = 1; newLen < runLength; newLen++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(word.substring(0, i));
                    for (int k = 0; k < newLen; k++) {
                        sb.append(word.charAt(i));
                    }
                    sb.append(word.substring(j));
                    results.add(sb.toString());
                }
            }
            i = j;
        }

        return results.size();  
    }
}