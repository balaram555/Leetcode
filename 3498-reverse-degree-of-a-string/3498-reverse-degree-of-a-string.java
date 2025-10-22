class Solution {
    public int reverseDegree(String s) {
        int ans=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int v=i+1;
            int a=('z'-c)+1;
            ans +=v*a;
        }
        return ans-1;
    }
}