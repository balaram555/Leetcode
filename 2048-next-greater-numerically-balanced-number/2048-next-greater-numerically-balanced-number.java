class Solution {
    public int nextBeautifulNumber(int n) {
        int num=n+1;
        while(true){
            if(isBalanced(num)){
                return num;
            }
            num++;
        }
    }
    public boolean isBalanced(int num){
        String s=String.valueOf(num);
        int[] arr=new int[10];
        for(char c: s.toCharArray()){
            arr[c-'0']++;
        }
        for(char c: s.toCharArray()){
            int d=c - '0';
            if(d==0 || arr[d] !=d){
                return false;
            }
        }
        return true;
    }
}