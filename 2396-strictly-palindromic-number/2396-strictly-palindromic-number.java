class Solution {
    public boolean isStrictlyPalindromic(int n) {
     for(int i=2;i<=n-2;i++){
        String c=Integer.toString(n,i);
        if(!isPalindrome(c))
        return false;
     }
     return true;
    }
    public boolean isPalindrome(String s){
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))
            return false;
        }
        return true;
    }
}