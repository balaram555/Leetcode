class Solution {
    public int lastRemaining(int n) {
        int start=1;
        int step=1;
        boolean left=true;
        int rem=n;
        while(rem>1){
            if(left||rem%2==1)
            start +=step;
            rem /=2;
            step *=2;
            left= !left;
        }
        return start;
    }
}