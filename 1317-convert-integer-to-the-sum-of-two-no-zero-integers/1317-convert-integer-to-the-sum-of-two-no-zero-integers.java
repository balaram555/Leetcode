class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
      for(int i=1;i<n;i++){
        int a=i;
        int b=n-i;
        if(a%10==0)
        continue;
        else if(b%10==0)
        continue;
        else if(a+b==n){
            arr[0]=a;
            arr[1]=b;
        }
      }  
      return arr;
    }
}