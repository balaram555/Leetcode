class Solution {
    public boolean isPalindrome(String s){
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        else if(isPalindrome(s)==true) return 1;
        else return 2;
    }
}