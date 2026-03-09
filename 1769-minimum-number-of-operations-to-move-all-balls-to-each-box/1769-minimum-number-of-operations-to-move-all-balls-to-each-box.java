class Solution {
    public int[] minOperations(String boxes) {
       int n=boxes.length();
       int[] res=new int[n];
       int b=0;
       int m=0;
       for(int i=0;i<n;i++){
        res[i] +=m;
        if(boxes.charAt(i)=='1')
        b++;
        m+=b;
       } 
       m=0;
       b=0;
       for(int i=n-1;i>=0;i--){
        res[i] +=m;
        if(boxes.charAt(i)=='1')
        b++;
        m+=b;
       }
       return res;
    }
}