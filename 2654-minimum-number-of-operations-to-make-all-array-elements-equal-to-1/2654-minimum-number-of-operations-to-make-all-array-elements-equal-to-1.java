class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        // boolean a=true;
        // for(int nu:nums){
        //     if(nu !=1)
        //     a=false;
        // }
        // if(a==true)
        // return 0;
        int count=0;
        for(int nu:nums){
            if(nu==1)
            count++;
        }
        if(count==n)
        return 0;

        if(count>0)
        return n-count;

        int s=nums[0];
       for(int i=1;i<n;i++){
        s=gcd(s,nums[i]);
       } 
       if(s!=1)
       return -1;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        int g=nums[i];
        for(int j=i;j<n;j++){
            g=gcd(g,nums[j]);
            if(g==1){
                min=Math.min(min,j-i+1);
                break;
            }
        }
       }
       return (min-1)+(n-1);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}