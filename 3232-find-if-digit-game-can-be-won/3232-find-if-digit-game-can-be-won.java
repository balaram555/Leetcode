class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0;
        int c=0;
       for(int num:nums){
        if(num>0&&num<10)
        sum +=num;
        else if(num>=10&&num<=99)
        c+=num;
       }
       if(sum==c)
       return false;
       return true;
    }
}