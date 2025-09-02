class Solution {
    public String reverseWords(String s) {
       StringBuilder result = new StringBuilder();
        String[] words = s.split("\\s+");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word); 
            sb.reverse(); 
            result.append(sb).append(" "); 
        }

        return result.toString().trim();
    }
}