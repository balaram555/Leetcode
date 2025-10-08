class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] ans=new int[n];
         for (int i = 0; i < n; i++) {
            int j = 0;  
            while (j < m) {
                long pro = (long) spells[i] * potions[j];
                if (pro >= success) {
                    ans[i] = m - j; 
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}