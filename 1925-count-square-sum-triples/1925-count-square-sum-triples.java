class Solution {
    public int countTriples(int n) {
       int count=0;
       for(int i=1;i<=n;i++){
        int a=i*i;
        for(int j=1;j<=n;j++){
            int b=a+j*j;
            int c=(int) Math.sqrt(b);
            if(c<=n && c*c==b){
                count++;
            }
        }
       } 
       return count;
    }
}