class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int sum=w*28+(w*(w-1)*7)/2;
        for(int i=1;i<=d;i++){
            sum+=w+i;
        }
        return sum;
    }
}