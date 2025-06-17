class Solution {
    public boolean isThree(int n) {
        int root=(int)Math.sqrt(n);
        if(root*root!=n) return false;
        return isprime(root);
    }
    private boolean isprime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}